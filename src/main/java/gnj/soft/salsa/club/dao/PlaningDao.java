package gnj.soft.salsa.club.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Planing;

/**
 * 
 * @author gnj_soft
 */
public interface PlaningDao extends JpaRepository<Planing, Serializable> {

	public Planing getPlaningById(Long id);
	
	public List<Planing> getPlaningByLessonId(Long lessonId);
	
	public List<Planing> getPlaningByTeacherId(Long teacherId);
	
	public List<Planing> getPlaningByMemberId(Long memberId);
}
