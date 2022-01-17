import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private List <Integer> grade;
    private double rating;

    public Student(){
    }

    public Student(int id, String firstName, String lastName, List<Integer> grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(List<Integer> grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public double rating(){
        int sum = 0;
        for (int i = 0; i<grade.size(); i++){
            sum = sum + grade.get(i);
        }
        return (double) sum / grade.size();
    }
}
