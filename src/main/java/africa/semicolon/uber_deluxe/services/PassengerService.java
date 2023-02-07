package africa.semicolon.uber_deluxe.services;

import africa.semicolon.uber_deluxe.data.dto.request.RegisterPassengerRequest;
import africa.semicolon.uber_deluxe.data.dto.response.RegisterResponse;

public interface PassengerService {
    RegisterResponse register(RegisterPassengerRequest registerRequest);
}
