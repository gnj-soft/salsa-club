package gnj.soft.salsa.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gnj.soft.salsa.club.dao.LoginDao;
import gnj.soft.salsa.club.model.Login;

/**
 * This class provides service according to salsa-club's login
 * 
 * @author Ghislain N.
 */
@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public List<Login> getLogins() {
		return this.loginDao.findAll();
	}

	public Login getLoginById(Long id) {
		return this.loginDao.getLoginById(id);
	}

	public Login getLoginByUsername(String username) {
		return this.loginDao.getLoginByUsername(username);
	}

	public Login getLoginByEmail(String email) {
		return this.loginDao.getLoginByEmail(email);
	}

	public Login saveLogin(Login login) {
		return this.loginDao.save(login);
	}

	public void deleteLogin(Long id) {
		this.loginDao.delete(id);
	}

	public boolean isLoginExist(Long id) {
		return this.loginDao.exists(id);
	}

	public long countExistingLogin() {
		return this.loginDao.count();
	}
}
