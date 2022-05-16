package Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Long> {
	@Query("SELECT u FROM Users u WHERE u.username = ?1")
	public Users findByUsername(String username);
}
