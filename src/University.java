import java.util.List;

public class University {
    private int id;
    private String name;
    private List<Group> listOfGroups;

    public University(){
    }

    public University(int id, String name, List<Group> listOfGroups) {
        this.id = id;
        this.name = name;
        this.listOfGroups = listOfGroups;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Group> getListOfGroups() {
        return listOfGroups;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfGroups(List<Group> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listOfGroups=" + listOfGroups +
                '}';
    }

    public double rating(){
        double sum = 0;
        List<Group> groupsList = getListOfGroups();
        for (Group group : groupsList){
            sum = sum + group.rating();
        }
        return sum / groupsList.size();
    }
}
