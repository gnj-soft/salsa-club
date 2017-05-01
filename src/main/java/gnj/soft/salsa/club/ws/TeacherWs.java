package gnj.soft.salsa.club.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.model.Teacher;
import gnj.soft.salsa.club.service.TeacherService;

/**
 * This class provides web services for Salsa-club teachers
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("teachers")
public class TeacherWs {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("")
	public void addTeacher(@RequestBody Teacher teacher) {
		this.teacherService.save(teacher);
	}
	
	@GetMapping("")
	public List<Teacher> getTeachers() {
		return this.teacherService.getTeachers();
	}
	
	@GetMapping("{id}")
	public Teacher getTeacherById(@PathVariable Long id) {
		return this.teacherService.getTeacherByTeacherId(id);
	}
	
	@PutMapping("")
	public void updateTeacher(@RequestBody Teacher teacher) {
		this.teacherService.save(teacher);
	}
	
	@DeleteMapping("{id}")
	public void deleteTeacher(@PathVariable Long id) {
		this.teacherService.delete(id);
	}
}
