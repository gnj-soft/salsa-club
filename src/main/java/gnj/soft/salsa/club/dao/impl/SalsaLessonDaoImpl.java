package gnj.soft.salsa.club.dao.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import gnj.soft.salsa.club.dao.SalsaLessonDao;
import gnj.soft.salsa.club.model.SalsaLesson;

/**
 * 
 * @author gnj_soft
 */
public class SalsaLessonDaoImpl implements SalsaLessonDao {

	@Override
	public SalsaLesson getlessonById(Long id) {
		return this.findOne(id);
	}

	@Override
	public SalsaLesson getLessonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalsaLesson> getLessonsBylevel(int level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalsaLesson> getStartedLessons(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalsaLesson> getEndLessons(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public SalsaLesson findOne(Serializable id) {
		return this.findOne(id);
	}
	
	@Override
	public void delete(Serializable id) {
		this.delete(id);
	}

	@Override
	public void delete(SalsaLesson entity) {
		this.delete(entity);
	}
	
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInBatch(Iterable<SalsaLesson> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SalsaLesson> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalsaLesson> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalsaLesson> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public SalsaLesson getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<SalsaLesson> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> S save(S entity) {
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
	public void delete(Iterable<? extends SalsaLesson> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends SalsaLesson> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends SalsaLesson> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends SalsaLesson> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
