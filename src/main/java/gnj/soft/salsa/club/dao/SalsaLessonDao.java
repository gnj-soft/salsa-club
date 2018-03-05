package gnj.soft.salsa.club.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.SalsaLesson;

/**
 * This class is the data access object for {@link SalsaLesson}
 * 
 * @author Ghislain N.
 */
public interface SalsaLessonDao extends JpaRepository<SalsaLesson, Long> {
	
	public SalsaLesson getSalsaLessonByLessonId(Long lessonId);
	
	public SalsaLesson getSalsaLessonByLessonName(String lessonName);
	
	public List<SalsaLesson> getSalsaLessonsByLessonLevel(Integer lessonLevel);
}
