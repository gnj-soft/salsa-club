package gnj.soft.salsa.club.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gnj.soft.salsa.club.dao.SalsaLessonDao;
import gnj.soft.salsa.club.model.SalsaLesson;

/**
 * This class provides service according to salsa-club's lessons
 * 
 * @author Ghislain N.
 */
@Service
public class SalsaLessonService {

	@Autowired
	private SalsaLessonDao salsaLessonDao;

	public Optional<SalsaLesson> getLessonByLessonId(Long lessonId) {
		return Optional.ofNullable(this.salsaLessonDao.getSalsaLessonByLessonId(lessonId));
	}

	public SalsaLesson getLessonByLessonName(String lessonName) {
		return this.salsaLessonDao.getSalsaLessonByLessonName(lessonName);
	}

	public List<SalsaLesson> getLessonsByLessonLevel(Integer lessonLevel) {
		return this.salsaLessonDao.getSalsaLessonsByLessonLevel(lessonLevel);
	}

	public boolean isSalsaLessonExist(Long lessonId) {
		return this.salsaLessonDao.existsById(lessonId);
	}

	public long countExistingLessons() {
		return this.salsaLessonDao.count();
	}

	public void deleteSalsaLessonById(Long id) {
		this.salsaLessonDao.deleteById(id);
	}

	public SalsaLesson save(SalsaLesson salsaLesson) {
		return this.salsaLessonDao.save(salsaLesson);
	}

	public List<SalsaLesson> getLessons() {
		return this.salsaLessonDao.findAll();
	}
}
