package gnj.soft.salsa.club.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.config.JwtTokenUtil;
import gnj.soft.salsa.club.model.AuthToken;
import gnj.soft.salsa.club.model.Login;
import gnj.soft.salsa.club.model.LoginUser;
import gnj.soft.salsa.club.service.LoginService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")
public class AuthenticationController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/generate-token", method = RequestMethod.POST)
	public ResponseEntity<?> register(@RequestBody LoginUser loginUser) throws AuthenticationException {

		final Login login = loginService.getLoginByUsername(loginUser.getUsername());
		final String token = JwtTokenUtil.generateToken(login);
		return ResponseEntity.ok(new AuthToken(token));
	}

}
