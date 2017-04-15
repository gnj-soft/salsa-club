package gnj.soft.salsa.club.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.SalsaLesson;

/**
 * This class is the data access object for {@link SalsaLesson}
 * 
 * @author Ghislain N.
 */
public interface SalsaLessonDao extends JpaRepository<SalsaLesson, Long> {
	
	public SalsaLesson getlessonByLessonId(Long lessonId);
	
	public SalsaLesson getLessonByLessonName(String lessonName);
	
	public List<SalsaLesson> getLessonsByLessonLevel(Integer lessonLevel);
	
	public List<SalsaLesson> getStartedLessons(Date date);
	
	public List<SalsaLesson> getEndLessons(Date date);
}
