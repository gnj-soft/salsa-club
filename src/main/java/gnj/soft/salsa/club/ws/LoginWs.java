package gnj.soft.salsa.club.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.model.Login;
import gnj.soft.salsa.club.service.LoginService;

/**
 * This class provides web services for Salsa-club login
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("/logins")
public class LoginWs {

	@Autowired
	private LoginService loginService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@GetMapping("")
	public List<Login> getLogins() {
		return this.loginService.getLogins();
	}

	@GetMapping("{username}")
	public Login getLoginByUsername(@PathVariable String username) {
		return this.loginService.getLoginByUsername(username);
	}

	@PostMapping("")
	public Login addLogin(@RequestBody Login login) {
		login.setPassword(this.bCryptPasswordEncoder.encode(login.getPassword()));
		return this.loginService.saveLogin(login);
	}
}
