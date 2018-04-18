package gnj.soft.salsa.club.ws;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	private MemberService memberService;

	@GetMapping("")
	public List<Member> getMembers() {
		List<Member> members = this.memberService.getMembers();
		return members.stream().sorted(Comparator.comparing(Member::getLastName).thenComparing(Member::getFirstName))
				.collect(Collectors.toList());
	}

	@PostMapping("")
	public Member addMember(@RequestBody Member member) {
		return this.memberService.save(member);
	}

	@PutMapping("")
	public Member updateMember(@RequestBody Member member) {
		return this.memberService.save(member);
	}

	@DeleteMapping("{id}")
	public void deleteMember(@PathVariable Long id) {
		this.memberService.deleteMemberById(id);
	}

	@GetMapping("{id}")
	public Member getMemberById(@PathVariable Long id) {
		return this.memberService.getMemberByMemberId(id);
	}
}
