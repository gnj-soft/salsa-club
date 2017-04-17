package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gnj.soft.salsa.club.dao.PlaningDao;
import gnj.soft.salsa.club.model.Planing;

/**
 * This class provides service according to salsa-club's planings
 * 
 * @author Ghislain N.
 */
@Component
public class PlaningService {
	
	@Autowired
	private PlaningDao planingDao;
	
	public List<Planing> getPlanings() {
		return this.planingDao.findAll();
	}
	
	public Planing getPlaningByPlaningId(Long planingId) {
		return this.planingDao.getPlaningByPlaningId(planingId);
	}
	
	public List<Planing> getPlaningsByLessonId(Long lessonId) {
		return this.planingDao.getPlaningsByLessonId(lessonId);
	}
	
	public List<Planing> getPlaningsByTeacherId(Long teacherId) {
		return this.planingDao.getPlaningsByTeacherId(teacherId);
	}
	
	public List<Planing> getPlaningsByMemberId(Long memberId) {
		return this.planingDao.getPlaningsByMemberId(memberId);
	}
	
	public boolean isPlaningExist(Long planingId) {
		return this.planingDao.exists(planingId);
	}
	
	public long countExistingPlanings() {
		return this.planingDao.count();
	}

	public void save(Long planingId, Long lessonId, Long teacherId, Long memberId, String note) {
		this.planingDao.save(new Planing(planingId, lessonId, teacherId, memberId, note));	
	}
}