package gnj.soft.salsa.club.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is a database mapping for Teacher table. It is part of salsa-club
 * project. For now I use {@link javax.persistence} instead of Hibernate.
 * 
 * @author Ghislain N.
 */
@Entity
public class Teacher implements Serializable {

	private static final long serialVersionUID = -6750085381586973066L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private Long teacherId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
	private Set<Lesson> lessons = new HashSet<>(0);
	@Column
	private String info;

	public Teacher() {
		// Empty constructor
	}

	public Teacher(Long teacherId, String firstName, String lastName, Set<Lesson> lessons, String info) {
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lessons = lessons;
		this.info = info;
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

	public Set<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Set<Lesson> lessons) {
		this.lessons = lessons;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
