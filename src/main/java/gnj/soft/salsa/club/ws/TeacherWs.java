package gnj.soft.salsa.club.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.service.TeacherService;

/**
 * This class provides web services for Salsa-club teachers
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("teachers")
public class TeacherWs {

	private TeacherService teacherService;
	
	
}
