package gnj.soft.salsa.club.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Lesson;

/**
 * This class is the data access object for {@link Lesson}
 * 
 * @author Ghislain N.
 */
public interface LessonDao extends JpaRepository<Lesson, Long> {

	public Lesson getLessonByLessonId(Long lessonId);

	public Lesson getLessonByLessonName(String lessonName);

	public List<Lesson> getLessonsByLessonLevel(Integer lessonLevel);
}
