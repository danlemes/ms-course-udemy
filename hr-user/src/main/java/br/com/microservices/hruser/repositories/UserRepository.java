package br.com.microservices.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.microservices.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
