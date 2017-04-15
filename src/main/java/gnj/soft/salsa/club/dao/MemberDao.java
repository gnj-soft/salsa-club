package gnj.soft.salsa.club.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Member;

/**
 * This class is the data access object for {@link Member}
 * 
 * @author Ghislain N.
 */
public interface MemberDao extends JpaRepository<Member, Long> {

	public Member getMemberByMemberId(Long memberId);
	
	public Member getMemberByLastName(String lastName);
	
	public List<Member> getMembersByLevel(Integer level);
}
