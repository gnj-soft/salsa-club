package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gnj.soft.salsa.club.dao.SalsaLessonDao;
import gnj.soft.salsa.club.model.SalsaLesson;

/**
 * This class provides service according to salsa-club's lessons
 * 
 * @author Ghislain N.
 */
@Component
public class SalsaLessonService {
	
	@Autowired
	private SalsaLessonDao salsaLessonDao;
	
	public SalsaLesson getLessonByLessonId(Long lessonId) {
		return this.salsaLessonDao.getSalsaLessonByLessonId(lessonId);
	}
	
	public SalsaLesson getLessonByLessonName(String lessonName) {
		return this.salsaLessonDao.getSalsaLessonByLessonName(lessonName);
	}
	
	public List<SalsaLesson> getLessonsByLessonLevel(Integer lessonLevel) {
		return this.salsaLessonDao.getSalsaLessonsByLessonLevel(lessonLevel);
	}
	
/*	public List<SalsaLesson> getStartedLessons(Date date) {
		return this.salsaLessonDao.getStartedLessons(date);
	}
	
	public List<SalsaLesson> getEndLessons(Date date) {
		return this.salsaLessonDao.getEndLessons(date);
	}*/
	
	public boolean isSalsaLessonExist(Long lessonId) {
		return this.salsaLessonDao.exists(lessonId);
	}
	
	public long countExistingLessons() {
		return this.salsaLessonDao.count();
	}

	public void deleteSalsaLesson(Long id) {
		this.salsaLessonDao.delete(id);
	}

	public void save(SalsaLesson salsaLesson) {
		this.salsaLessonDao.save(salsaLesson);
	}

	public List<SalsaLesson> getLessons() {
		return this.salsaLessonDao.findAll();
	}
}
