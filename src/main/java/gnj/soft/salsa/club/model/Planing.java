package gnj.soft.salsa.club.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * This class is a database mapping for Planing table. It is part of salsa-club project.
 * For now I use {@link javax.persistence} instead of hybernate.
 * 
 * @author gnj_soft
 */
@Entity
public class Planing {
	
	@Id
	private Long planingId;
	@Column(nullable = false)
	private Long lessonId;
	@Column(nullable = false)
	private Long teacherId;
	@Column(nullable = false)
	private Long memberId;
	@Column
	private String note;
		
	public Planing() {
		super();
	}

	public Planing(Long planingId, Long lessonId, Long teacherId, Long memberId, String note) {
		super();
		this.planingId = planingId;
		this.lessonId = lessonId;
		this.teacherId = teacherId;
		this.memberId = memberId;
		this.note = note;
	}

	public Long getPlaningId() {
		return planingId;
	}

	public void setPlaningId(Long planingId) {
		this.planingId = planingId;
	}

	public Long getLessonId() {
		return lessonId;
	}

	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
