package africa.semicolon.uber_deluxe.data.repositories;

import africa.semicolon.uber_deluxe.data.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
