package gnj.soft.salsa.club.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.model.Member;
import gnj.soft.salsa.club.service.MemberService;

/**
 * This class provides web services for Salsa-club members
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("members")
public class MemberWs {

	@Autowired
	public MemberService memberService;
	
	@GetMapping("")
	public List<Member> getMembers() {
		return this.memberService.getMembers();
	}
	
	@PostMapping("")
	public void addMember(Member member) {
		this.memberService.save(member);
	}
	
	@PutMapping("{id}")
	public void updateMember(@RequestBody Member member) {
		this.memberService.save(member);
	}
	
	public void deleteMember(Long id) {
		this.memberService.deleteMember(id);
	}
	
	@GetMapping("{id}")
	public Member getMemberById(@PathVariable Long id) {
		return this.memberService.getMemberByMemberId(id);
	}
}
