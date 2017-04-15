package gnj.soft.salsa.club.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is a database mapping for Member table. It is part of salsa-club project.
 * For now I use {@link javax.persistence} instead of Hibernate.
 * 
 * @author Ghislain N.
 */
@Entity
public class Member {

	@Id
	private Long memberId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private Integer level;
	
	public Member() {
		// Empty constructor
	}

	public Member(Long memberId, String firstName, String lastName, Integer level) {
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.level = level;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
