package Table_qlsinhvien;

public class SinhVien {
	
	    private String studentID;
	    private String name;
	    private int age;
	    private String className;

	    // Constructor
	    public SinhVien(String studentID, String name, int age, String className) {
	        this.studentID = studentID;
	        this.name = name;
	        this.age = age;
	        this.className = className;
	    }

	    // Getters
	    public String getStudentID() {
	        return studentID;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getClassName() {
	        return className;
	    }
	}

