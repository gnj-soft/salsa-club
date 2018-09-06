package gnj.soft.salsa.club.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Planing;

/**
 * This class is the data access object for {@link Planing}
 * 
 * @author Ghislain N.
 */
public interface PlaningDao extends JpaRepository<Planing, Long> {

	public Planing getPlaningByPlaningId(Long planingId);
}
