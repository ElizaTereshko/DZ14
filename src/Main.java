import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grade1 = Arrays.asList(7, 8, 9);
        Student student1 = new Student(1, "Andrey", "Kat", grade1);
        System.out.println(student1.rating());

        List<Integer> grade2 = Arrays.asList(5, 8, 4);
        Student student2 = new Student(2, "Vanya", "Lop", grade2);

        List<Student> listOfStudents1 = Arrays.asList(student1, student2);

        List<Integer> grade3 = Arrays.asList(2, 8, 10);
        Student student3 = new Student(3, "Ola", "Pop", grade3);

        List<Integer> grade4 = Arrays.asList(4, 6, 5);
        Student student4 = new Student(4, "Sam", "Lid", grade4);

        List<Student> listOfStudents2 = Arrays.asList(student3, student4);

        List<Integer> grade5 = Arrays.asList(4, 7, 3);
        Student student5 = new Student(5, "Kate", "Lag", grade5);

        List<Integer> grade6 = Arrays.asList(9, 10, 8);
        Student student6 = new Student(6, "Diana", "Bur", grade6);

        List<Student> listOfStudents3 = Arrays.asList(student5, student6);

        List<Integer> grade7 = Arrays.asList(8, 7, 8);
        Student student7 = new Student(7, "Nik", "Lok", grade7);

        List<Integer> grade8 = Arrays.asList(4, 7, 8);
        Student student8 = new Student(8, "Lilo", "Def", grade8);

        List<Student> listOfStudents4 = Arrays.asList(student7, student8);

        List<Student> mainListOfStudents = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8);
        ObjectMapper objectMapper1 = new ObjectMapper();
        final String baseFile1 = "students.json";
        try {
            objectMapper1.writeValue(new File(baseFile1), mainListOfStudents);
        } catch (IOException e){
            e.printStackTrace();
        }

        Group group1 = new Group(1, "11", listOfStudents1);
        System.out.println(group1.rating());
        Group group2 = new Group(2, "22", listOfStudents2);

        List <Group> listOfGroups1 = Arrays.asList(group1, group2);

        Group group3 = new Group(3, "33", listOfStudents3);
        Group group4 = new Group(4, "44", listOfStudents4);

        List<Group> listOfGroups2 = Arrays.asList(group3, group4);

        List<Group> mainListOfGroups = Arrays.asList(group1, group2, group3, group4);
        ObjectMapper objectMapper2 = new ObjectMapper();
        final String baseFile2 = "groups.json";
        try{
            objectMapper2.writeValue(new File(baseFile2), mainListOfGroups);
        } catch (IOException e){
            e.printStackTrace();
        }

        University university1 = new University(1, "BNTY", listOfGroups1);
        System.out.println(university1.rating());
        University university2 = new University(2, "BSUIR", listOfGroups2);

        List<University> mainListOfUniversities = Arrays.asList(university1, university2);
        ObjectMapper objectMapper3 = new ObjectMapper();
        final String baseFile3 = "universities.json";
        try{
            objectMapper3.writeValue(new File(baseFile3), mainListOfUniversities);
        } catch (IOException e){
            e.printStackTrace();
        }

        List<Student> sortedGroupByRating = group1.sortByRating();
        ObjectMapper objectMapper4 = new ObjectMapper();
        final String baseFile4 = "sortedGroup.json";
        try {
            objectMapper4.writeValue(new File(baseFile4), sortedGroupByRating);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
