package StudentCurdAppController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavStudentController {
	@GetMapping("/addstudent")
	public String addingStudentMapping() {
		return "addstudent";
	}

}
