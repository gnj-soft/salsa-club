package gnj.soft.salsa.club.ws;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return this.teacherService.save(teacher);
	}

	@GetMapping("")
	public List<Teacher> getTeachers() {
		List<Teacher> teachers = this.teacherService.getTeachers();
		return teachers.stream().sorted(Comparator.comparing(Teacher::getLastName).thenComparing(Teacher::getFirstName))
				.collect(Collectors.toList());
	}

	@GetMapping("{id}")
	public Teacher getTeacherById(@PathVariable Long id) {
		return this.teacherService.getTeacherByTeacherId(id).get();
	}

	@PutMapping("")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return this.teacherService.save(teacher);
	}

	@DeleteMapping("{id}")
	public void deleteTeacher(@PathVariable Long id) {
		this.teacherService.delete(id);
	}
}
