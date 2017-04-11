package gnj.soft.salsa.club.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import gnj.soft.salsa.club.dao.TeacherDao;
import gnj.soft.salsa.club.model.Teacher;

/**
 * 
 * @author gnj_soft
 */
public class TeacherDaoImpl implements TeacherDao {
	
	@Override
	public Teacher getTeacherById(Long id) {
		return this.findOne(id);
	}

	@Override
	public Teacher getTeacherByLastName(String name) {
		return null;
	}
	
	@Override
	public List<Teacher> findAll() {
		return this.findAll();
	}
	
	@Override
	public void delete(Serializable id) {
		this.delete(id);

	}

	@Override
	public void delete(Teacher entity) {
		this.delete(entity);

	}
	
	@Override
	public Teacher findOne(Serializable id) {
		return this.findOne(id);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInBatch(Iterable<Teacher> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Teacher> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public Teacher getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Teacher> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> S save(S entity) {
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
	public void delete(Iterable<? extends Teacher> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Teacher> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Teacher> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Teacher> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
