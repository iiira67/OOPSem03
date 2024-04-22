package OOPSem03;

public class StudentGroup {
    private String groupName;
    private int numberOfStudents;

    public StudentGroup(String groupName, int numberOfStudents) {
        this.groupName = groupName;
        this.numberOfStudents = numberOfStudents;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + "'" +
                ", numberOfStudents=" + numberOfStudents +
                "}";
    }
}
