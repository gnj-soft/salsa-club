package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gnj.soft.salsa.club.dao.TeacherDao;
import gnj.soft.salsa.club.model.Teacher;

/**
 * 
 * @author gnj_soft
 */
@Component
public class TeacherService {
	
	@Autowired
	private TeacherDao teacherDao;
	
	public List<Teacher> getTeachers() {
		return teacherDao.findAll();
	}
	
	public Teacher getTeacherById(Long id) {
		return teacherDao.getTeacherById(id);
	}
	
	public Teacher getTeacherByLastName(String name) {
		return teacherDao.getTeacherByLastName(name);
	}

}
