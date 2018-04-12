package gnj.soft.salsa.club.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gnj.soft.salsa.club.model.Login;

public interface LoginDao extends JpaRepository<Login, Long> {

	public Login getLoginById(Long id);

	public Login getLoginByUsername(String username);

	public Login getLoginByEmail(String email);
}
