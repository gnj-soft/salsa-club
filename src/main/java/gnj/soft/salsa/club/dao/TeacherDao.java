package gnj.soft.salsa.club.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Teacher;

/**
 * 
 * @author gnj_soft
 */
public interface TeacherDao extends JpaRepository<Teacher, Serializable> {
	
	public Teacher getTeacherById(Long id);
	
	public Teacher getTeacherByLastName(String name);

}
