package kodlama.io.dataAccess;

import java.util.ArrayList;

import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	ArrayList<Instructor> instructorArrayList = new ArrayList<>();
	
	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName() + " --> JDBC ile veritabanına eklendi.");
		instructorArrayList.add(instructor);
	}

	@Override
	public ArrayList<Instructor> getAllInstructors() {
		return instructorArrayList;
	}

}
