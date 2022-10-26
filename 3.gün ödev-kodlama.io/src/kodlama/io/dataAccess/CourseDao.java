package kodlama.io.dataAccess;

import java.util.ArrayList;

import kodlama.io.entities.Course;

public interface CourseDao {
	
	void addCourse(Course course);
	
	ArrayList<Course> getAllCourses();
}
