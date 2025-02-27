
public class Student {
	 private int rollNo;
	    private String name;
	    private String course;

	    // Constructor
	    public Student(int rollNo, String name, String course) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.course = course;
	    }

	    // Getters and Setters
	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

	    @Override
	    public String toString() {
	        return "Roll No: " + rollNo + ", Name: " + name + ", Course: " + course;
	    }
	}

