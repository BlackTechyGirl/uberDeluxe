package africa.semicolon.uber_deluxe.services;

import africa.semicolon.uber_deluxe.data.dto.request.BookRideRequest;
import africa.semicolon.uber_deluxe.data.dto.request.RegisterPassengerRequest;
import africa.semicolon.uber_deluxe.data.dto.response.ApiResponse;
import africa.semicolon.uber_deluxe.data.dto.response.RegisterResponse;
import africa.semicolon.uber_deluxe.data.models.AppUser;
import africa.semicolon.uber_deluxe.data.models.Passenger;
import com.github.fge.jsonpatch.JsonPatch;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface PassengerService {
    RegisterResponse register(RegisterPassengerRequest registerRequest);
    Passenger getPassengerById(Long passengerId);

    void savePassenger(Passenger passenger);
    Optional<Passenger> getPassengerBy(Long passengerId);
    Passenger updatePassenger(Long passengerId, JsonPatch updatePayload);

    Page<Passenger> getAllPassenger(int pageNumber);

    void deletePassenger(Long id);

    ApiResponse bookRide(BookRideRequest bookRideRequest);
}
