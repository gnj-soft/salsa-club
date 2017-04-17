package gnj.soft.salsa.club.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import gnj.soft.salsa.club.TestSetUp;
import gnj.soft.salsa.club.model.Member;

/**
 * This is the class test for {@link MemberService}
 * 
 * @author Ghislain N.
 */
public class MemberServiceTest extends TestSetUp {
	
	@Autowired
	private MemberService memberService;
	
	@Before
	public void setUp() {
		this.memberService.save(new Member(1L, "Elsa", "Bermudez", 10));
		this.memberService.save(new Member(2L, "Hélène", "Leys", 15));
	}
	
	@Test
	public void getMembers() {
		
		long nbOfMembers = this.memberService.countExistingMembers();
		Assert.assertEquals(2,nbOfMembers);
		
		List<Member> members = this.memberService.getMembers();
		Assert.assertNotNull("An error occur !", members);
	}
	
	@Test
	public void getMemberByMemberId() {
		
		Member member2 = this.memberService.getMemberByMemberId(2L);
		Assert.assertNotNull(member2);
		
		Assert.assertEquals("Hélène", member2.getFirstName());
		Assert.assertEquals("Leys", member2.getLastName());
		Assert.assertEquals(new Integer(15), member2.getLevel());
		
		Member member1 = this.memberService.getMemberByMemberId(1L);
		Assert.assertNotNull(member1);
		
		Assert.assertEquals("Elsa", member1.getFirstName());
		Assert.assertEquals("Bermudez", member1.getLastName());
		Assert.assertEquals(new Integer(10), member1.getLevel());
	}
}
