package africa.semicolon.uber_deluxe.data.repositories;

import africa.semicolon.uber_deluxe.data.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
