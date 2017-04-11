package gnj.soft.salsa.club.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is a database mapping for Teacher table. It is part of salsa-club project.
 * For now I use {@link javax.persistence} instead of hybernate.
 * 
 * @author gnj_soft
 */
@Entity
public class Teacher {
	
	@Id
	private Long teacherId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	
	public Teacher() {
		super();
	}

	public Teacher(Long teacherId, String firstName, String lastName) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
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
}
