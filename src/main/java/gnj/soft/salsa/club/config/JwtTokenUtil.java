package gnj.soft.salsa.club.config;

import java.io.Serializable;
import java.util.Date;

import gnj.soft.salsa.club.model.Login;
import gnj.soft.salsa.club.security.SecurityConstants;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtTokenUtil implements Serializable {

	private static final long serialVersionUID = 1L;

	public static String generateToken(Login login) {
		return Jwts.builder().setSubject(login.getUsername())
				.setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SecurityConstants.SECRET.getBytes()).compact();
	}
}
