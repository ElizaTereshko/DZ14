import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Group {
    private int id;
    private String name;
    private List <Student> listOfStudents;

    public Group(){
    }

    public Group(int id, String name, List<Student> listOfStudents) {
        this.id = id;
        this.name = name;
        this.listOfStudents = listOfStudents;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listOfStudents=" + listOfStudents +
                '}';
    }

    public double rating(){
        double sum = 0;
        List<Student> studentsList = getListOfStudents();
        for(Student student: studentsList){
            sum = sum + student.rating();
        }
        return sum / studentsList.size();
    }

    public List<Student> sortByRating(){
        List<Student> studentsList = getListOfStudents();
        List<Student> sortedStudentsList = studentsList.stream()
                .sorted(Comparator.comparing(Student::rating))
                .collect(Collectors.toList());
        return sortedStudentsList;
    }
}
