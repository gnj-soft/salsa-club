package gnj.soft.salsa.club.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is a database mapping for Lesson table. It is part of salsa-club project.
 * For now I use {@link javax.persistence} instead of hybernate.
 * 
 * @author gnj_soft
 */
@Entity
public class SalsaLesson {
	
	@Id
	private Long lessonId;
	@Column
	private String lessonName;
	@Column(nullable = false)
	private int lessonLevel;
	@Column(nullable = false)
	private Date startDate;
	@Column(nullable = false)
	private Date endDate;
	@Column(nullable = false)
	private int duration;
	
	public SalsaLesson() {
		super();
	}

	public SalsaLesson(Long lessonId, String lessonName, int lessonLevel, Date startDate, Date endDate, int duration) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.lessonLevel = lessonLevel;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
	}

	public Long getLessonId() {
		return lessonId;
	}

	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}

	public int getLessonLevel() {
		return lessonLevel;
	}

	public void setLessonLevel(int lessonLevel) {
		this.lessonLevel = lessonLevel;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
}
