package StudentCurdAppservies;

import org.springframework.beans.factory.annotation.Autowired;

import StudentCurdAppentities.StudentApp;
import StudentCurdApprepositories.StudentAppRepository;

public class StudentServiceAppImplementation implements StudentServiceApp {
	@Autowired
	StudentAppRepository repo;

	@Override
	public String addstudent(StudentApp student) {
		// TODO Auto-generated method stub
		repo.save(student);
		return "student is created and saved";
	}

}
