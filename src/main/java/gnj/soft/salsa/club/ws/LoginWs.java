package gnj.soft.salsa.club.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.model.Login;
import gnj.soft.salsa.club.service.LoginService;

/**
 * This class provides web services for Salsa-club members
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("logins")
public class LoginWs {

	@Autowired
	private LoginService loginService;

	@GetMapping("")
	public List<Login> getLogins() {
		return this.loginService.getLogins();
	}

	@PostMapping("")
	public Login addLogin(@RequestBody Login login) {
		return this.loginService.saveLogin(login);
	}
}
