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

import gnj.soft.salsa.club.model.SalsaLesson;
import gnj.soft.salsa.club.service.SalsaLessonService;

/**
 * This class provides web services for Salsa-club lessons
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("salsa-lessons")
public class SalsaLessonWs {

	@Autowired
	private SalsaLessonService salsaLessonService;
	
	@PostMapping("")
	public void addSalsaLesson(@RequestBody SalsaLesson lesson) {
		this.salsaLessonService.save(lesson);
	}
	
	@GetMapping("")
	public List<SalsaLesson> getSalsaLessons() {
		return this.salsaLessonService.getLessons();
	}
	
	@GetMapping("{id}")
	public SalsaLesson getSalsaLessonById(@PathVariable Long id) {
		return this.salsaLessonService.getLessonByLessonId(id);
	}
	
	@PutMapping("")
	public void updateSalsaLesson(@RequestBody SalsaLesson salsaLesson) {
		this.salsaLessonService.save(salsaLesson);
	}
	
	@DeleteMapping("{id}")
	public void deleteSalsaLesson(@PathVariable Long id) {
		this.salsaLessonService.deleteSalsaLesson(id);
	}
}
