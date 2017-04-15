package gnj.soft.salsa.club.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Planing;

/**
 * This class is the data access object for {@link Planing}
 * 
 * @author Ghislain N.
 */
public interface PlaningDao extends JpaRepository<Planing, Long> {

	public Planing getPlaningByPlaningId(Long planingId);
	
	public List<Planing> getPlaningsByLessonId(Long lessonId);
	
	public List<Planing> getPlaningsByTeacherId(Long teacherId);
	
	public List<Planing> getPlaningsByMemberId(Long memberId);
}
