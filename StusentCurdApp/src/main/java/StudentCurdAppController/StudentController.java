package StudentCurdAppController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import StudentCurdAppentities.StudentApp;
import StudentCurdAppservies.StudentServiceApp;

@Controller
public class StudentController {
	@Autowired
	StudentServiceApp studentv;
	public String addstudent(@ModelAttribute StudentApp student) {
		return "studentadded";
	}

}
