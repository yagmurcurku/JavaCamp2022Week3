package kodlama.io.entities;

public class Course {
	
	private String courseName;
	private int coursePrice;
	private Instructor instructor;
	
	
	public Course() {
	}
	
	public Course(String courseName, int coursePrice, Instructor instructor) {
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.instructor = instructor;
	
	}
	
	
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	

}
