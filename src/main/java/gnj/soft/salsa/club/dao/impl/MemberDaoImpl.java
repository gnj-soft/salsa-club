package gnj.soft.salsa.club.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import gnj.soft.salsa.club.dao.MemberDao;
import gnj.soft.salsa.club.model.Member;

/**
 * 
 * @author gnj_soft
 */
public class MemberDaoImpl implements MemberDao {

	@Override
	public Member getMemberById(Long id) {
		return this.findOne(id);
	}
	
	@Override
	public Member getMemberByLastName(String name) {
		return null;
	}

	@Override
	public List<Member> getMembersByLevel(int level) {
		return null;
	}
	
	@Override
	public List<Member> findAll() {
		return this.findAll();
	}
	
	@Override
	public Member findOne(Serializable arg0) {
		return this.findOne(arg0);
	}
	
	@Override
	public void delete(Serializable arg0) {
		this.delete(arg0);
	}

	@Override
	public void delete(Member arg0) {
		this.delete(arg0);
	}
	
	@Override
	public void deleteInBatch(Iterable<Member> arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Member> findAll(Sort arg0) {
		return this.findAll(arg0);
	}

	@Override
	public List<Member> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Member> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Member> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public Member getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Member> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Member> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Member> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Iterable<? extends Member> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Serializable arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Member> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Member> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Member> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Member> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Member> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
}
