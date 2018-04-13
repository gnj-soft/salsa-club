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

import gnj.soft.salsa.club.model.SalsaLesson;
import gnj.soft.salsa.club.service.SalsaLessonService;

/**
 * This class provides web services for Salsa-club lessons
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("lessons")
public class SalsaLessonWs {

	@Autowired
	private SalsaLessonService salsaLessonService;

	@PostMapping("")
	public SalsaLesson addSalsaLesson(@RequestBody SalsaLesson lesson) {
		return this.salsaLessonService.save(lesson);
	}

	@GetMapping("")
	public List<SalsaLesson> getSalsaLessons() {
		List<SalsaLesson> lessons = this.salsaLessonService.getLessons();
		return lessons.stream()
				.sorted(Comparator.comparing(SalsaLesson::getLessonLevel).thenComparing(SalsaLesson::getLessonName))
				.collect(Collectors.toList());
	}

	@GetMapping("{id}")
	public SalsaLesson getSalsaLessonById(@PathVariable Long id) {
		return this.salsaLessonService.getLessonByLessonId(id).get();
	}

	@PutMapping("")
	public SalsaLesson updateSalsaLesson(@RequestBody SalsaLesson salsaLesson) {
		return this.salsaLessonService.save(salsaLesson);
	}

	@DeleteMapping("{id}")
	public void deleteSalsaLesson(@PathVariable Long id) {
		this.salsaLessonService.deleteSalsaLesson(id);
	}
}
