package View_Staff;

public class Staff {
    private String staffID;
    private String name;
    private String dob;
    private int age;
    private String gender;
    private String hometown;
    private String position;

    public Staff(String staffID, String name, String dob, int age, String gender, String hometown, String position) {
        this.staffID = staffID;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.hometown = hometown;
        this.position = position;
    }

    public String getStaffID() { return staffID; }
    public String getName() { return name; }
    public String getDob() { return dob; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getHometown() { return hometown; }
    public String getPosition() { return position; }

    public void setStaffID(String staffID) { this.staffID = staffID; }
    public void setName(String name) { this.name = name; }
    public void setDob(String dob) { this.dob = dob; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setHometown(String hometown) { this.hometown = hometown; }
    public void setPosition(String position) { this.position = position; }
}
