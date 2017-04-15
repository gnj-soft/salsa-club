package gnj.soft.salsa.club.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Teacher;

/**
 * This class is the data access object for {@link Teacher}
 * 
 * @author Ghislain N.
 */
public interface TeacherDao extends JpaRepository<Teacher, Long> {
	
	public Teacher getTeacherByTeacherId(Long teacherId);
	
	public Teacher getTeacherByLastName(String lastName);

}
