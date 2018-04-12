package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gnj.soft.salsa.club.dao.MemberDao;
import gnj.soft.salsa.club.model.Member;

/**
 * This class provides service according to salsa-club's members
 * 
 * @author Ghislain N.
 */
@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;

	public List<Member> getMembers() {
		return this.memberDao.findAll();
	}

	public Member getMemberByMemberId(Long memberId) {
		return this.memberDao.getMemberByMemberId(memberId);
	}

	public Member getMemberByLastName(String lastName) {
		return this.memberDao.getMemberByLastName(lastName);
	}

	public List<Member> getMembersByLevel(Integer level) {
		return this.memberDao.getMembersByLevel(level);
	}

	public boolean isMemberExist(Long memberId) {
		return this.memberDao.exists(memberId);
	}

	public long countExistingMembers() {
		return this.memberDao.count();
	}

	public Member save(Member member) {
		return this.memberDao.save(member);
	}

	public void deleteMember(Long id) {
		this.memberDao.delete(id);
	}
}
