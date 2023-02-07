package africa.semicolon.uber_deluxe.data.repositories;

import africa.semicolon.uber_deluxe.data.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
