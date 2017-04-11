package gnj.soft.salsa.club.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.SalsaLesson;

/**
 * 
 * @author gnj_soft
 */
public interface SalsaLessonDao extends JpaRepository<SalsaLesson, Serializable> {
	
	public SalsaLesson getlessonById(Long id);
	
	public SalsaLesson getLessonByName(String name);
	
	public List<SalsaLesson> getLessonsBylevel(int level);
	
	public List<SalsaLesson> getStartedLessons(Date date);
	
	public List<SalsaLesson> getEndLessons(Date date);
}
