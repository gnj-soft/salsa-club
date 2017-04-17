package gnj.soft.salsa.club.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import gnj.soft.salsa.club.TestSetUp;
import gnj.soft.salsa.club.model.Member;


public class MemberDaoTest extends TestSetUp{
	
	@Autowired
	private MemberDao memberDao;
	
	@Before
	public void setUp() {
		this.memberDao.save(new Member(1L, "Elsa", "Bermudez", 10));
	}

	@Test
	public void findAll() {
		assertEquals(1, this.memberDao.findAll().size());
	}
	
	@Test
	public void getMembers(){
		
		long nbOfMembers = this.memberDao.count();
		Assert.assertEquals(1,nbOfMembers);
		
		List<Member> members = this.memberDao.findAll();
		Assert.assertNotNull("An error occur !", members);
		Assert.assertEquals("Elsa", members.get(0).getFirstName());
		Assert.assertEquals("Bermudez", members.get(0).getLastName());
		Assert.assertEquals(new Integer(10), members.get(0).getLevel());
	}
}
