package gnj.soft.salsa.club.service;

import static java.util.Collections.emptyList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gnj.soft.salsa.club.model.Login;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private LoginService loginService;

	public UserDetailsServiceImpl(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Login login = loginService.getLoginByUsername(username);
		if (login == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(login.getUsername(), login.getPassword(), emptyList());
	}
}
