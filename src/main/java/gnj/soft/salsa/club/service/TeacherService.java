package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gnj.soft.salsa.club.dao.TeacherDao;
import gnj.soft.salsa.club.model.Teacher;

/**
 * This class provides service according to salsa-club's teachers
 * 
 * @author Ghislain N.
 */
@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	public List<Teacher> getTeachers() {
		return this.teacherDao.findAll();
	}

	public Teacher getTeacherByTeacherId(Long teacherid) {
		return this.teacherDao.getTeacherByTeacherId(teacherid);
	}

	public Teacher getTeacherByLastName(String lastName) {
		return this.teacherDao.getTeacherByLastName(lastName);
	}

	public boolean isTeacherExist(Long teacherId) {
		return this.teacherDao.exists(teacherId);
	}

	public long countExistingTeachers() {
		return this.teacherDao.count();
	}

	public Teacher save(Teacher teacher) {
		return this.teacherDao.save(teacher);
	}

	public void delete(Long id) {
		this.teacherDao.delete(id);
	}
}