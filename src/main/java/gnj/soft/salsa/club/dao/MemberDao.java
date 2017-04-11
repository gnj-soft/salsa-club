package gnj.soft.salsa.club.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Member;

/**
 * 
 * @author gnj_soft
 */
public interface MemberDao extends JpaRepository<Member, Serializable> {

	public Member getMemberById(Long id);
	
	public Member getMemberByLastName(String name);
	
	public List<Member> getMembersByLevel(int level);
}
