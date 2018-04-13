package gnj.soft.salsa.club.ws;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
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

import gnj.soft.salsa.club.model.Planing;
import gnj.soft.salsa.club.model.SalsaLesson;
import gnj.soft.salsa.club.model.Teacher;
import gnj.soft.salsa.club.service.PlaningService;
import gnj.soft.salsa.club.service.SalsaLessonService;
import gnj.soft.salsa.club.service.TeacherService;

/**
 * This class provides web services for Salsa-club Planings
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("planings")
public class PlaningWs {

	@Autowired
	private PlaningService planingService;

	@Autowired
	private SalsaLessonService salsaLessonService;

	@Autowired
	private TeacherService teacherService;

	@PostMapping("")
	public Planing addPlaning(@RequestBody Planing planing) {
		return this.planingService.save(planing);
	}

	@GetMapping("")
	public List<Planing> getPlanings() {
		List<Planing> planings;
		planings = this.planingService.getPlanings();

		Consumer<Planing> completePlaning = p -> {

			Optional<SalsaLesson> lesson = this.salsaLessonService.getLessonByLessonId(p.getLessonId());
			lesson.ifPresent(l -> p.setLessonName(l.getLessonName()));

			Optional<Teacher> teacher = this.teacherService.getTeacherByTeacherId(p.getTeacherId());
			teacher.ifPresent(t -> {
				p.setTeacherFirstName(t.getFirstName());
				p.setTeacherLastName(t.getLastName());
			});
		};
		planings.forEach(completePlaning);
		return planings.stream().sorted(Comparator.comparing(Planing::getTeacherLastName).reversed())
				.collect(Collectors.toList());
	}

	@GetMapping("{id}")
	public Planing getPlaningById(@PathVariable Long id) {
		return this.planingService.getPlaningByPlaningId(id);
	}

	@PutMapping("")
	public Planing updatePlaning(@RequestBody Planing planing) {
		return this.planingService.save(planing);
	}

	@DeleteMapping("{id}")
	public void deletePlaning(@PathVariable Long id) {
		this.planingService.deletePlaning(id);
	}
}
