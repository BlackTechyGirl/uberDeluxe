package africa.semicolon.uber_deluxe.data.repositories;

import africa.semicolon.uber_deluxe.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
