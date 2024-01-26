package sarahguarneri.BEU2W3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W3.entites.User;

import java.util.UUID;

@Repository
public interface UserDAO extends JpaRepository<User, UUID> {

    public User findByEmail(String email);
}
