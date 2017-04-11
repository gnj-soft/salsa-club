package gnj.soft.salsa.club.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import gnj.soft.salsa.club.dao.PlaningDao;
import gnj.soft.salsa.club.model.Planing;

/**
 * 
 * @author gnj_soft
 */
public class PlaningDaoImpl implements PlaningDao {

	@Override
	public Planing getPlaningById(Long id) {
		return this.findOne(id);
	}

	@Override
	public List<Planing> getPlaningByLessonId(Long lessonId) {
		return null;
	}

	@Override
	public List<Planing> getPlaningByTeacherId(Long teacherId) {
		return null;
	}

	@Override
	public List<Planing> getPlaningByMemberId(Long memberId) {
		return null;
	}
	
	@Override
	public List<Planing> findAll() {
		return this.findAll();
	}
	
	@Override
	public void delete(Serializable id) {
		this.delete(id);	
	}

	@Override
	public void delete(Planing entity) {
		this.delete(entity);	
	}
	
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Planing> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Planing> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planing> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Planing getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Planing> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Planing findOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Iterable<? extends Planing> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Planing> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Planing> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Planing> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
