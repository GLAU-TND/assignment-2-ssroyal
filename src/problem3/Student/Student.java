package problem3.Student;

public class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private String section;

    public Student(int rollNo, String firstName, String lastName, String section) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}