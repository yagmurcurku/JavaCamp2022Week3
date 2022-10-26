package kodlama.io.dataAccess;

import java.util.ArrayList;

import kodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{
	ArrayList<Course> courseArrayList = new ArrayList<>();

	@Override
	public void addCourse(Course course) {
		System.out.println(course.getCourseName() + " --> JDBC ile veritabanına eklendi.");
		courseArrayList.add(course);
	}

	@Override
	public ArrayList<Course> getAllCourses() {
		return courseArrayList;
	}

}
