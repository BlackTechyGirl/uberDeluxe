package africa.semicolon.uber_deluxe.data.repositories;

import africa.semicolon.uber_deluxe.data.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
