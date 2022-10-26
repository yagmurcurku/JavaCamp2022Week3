package kodlama.io.Business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers)
	{
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception
	{
		for (Course c : courseDao.getAllCourses()) {
			if(c.getCourseName() == course.getCourseName())
			{
				throw new Exception("Kurs ismi tekrar edemez !");
			}
		}
		
		if(course.getCoursePrice()<0)
		{
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz !");
		}
		
		courseDao.addCourse(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
