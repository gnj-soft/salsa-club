package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gnj.soft.salsa.club.dao.MemberDao;
import gnj.soft.salsa.club.dao.impl.MemberDaoImpl;
import gnj.soft.salsa.club.model.Member;

/**
 * 
 * @author gnj_soft
 */
@Component
public class MemberService {
	
	@Autowired
	private MemberDao memberDao = new MemberDaoImpl();
	
	public List<Member> getMembers() {
		return memberDao.findAll();
	}
	
	public Member getMemberById(Long id) {
		return memberDao.getMemberById(id);
	}
	
	public Member getMemberByLastName(String name) {
		return memberDao.getMemberByLastName(name);
	}
	
	public List<Member> getMembersByLevel(int level) {
		return memberDao.getMembersByLevel(level);
	}

}
