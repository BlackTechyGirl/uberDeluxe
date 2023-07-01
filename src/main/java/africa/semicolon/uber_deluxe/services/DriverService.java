package africa.semicolon.uber_deluxe.services;

import africa.semicolon.uber_deluxe.data.dto.request.RegisterDriverRequest;
import africa.semicolon.uber_deluxe.data.dto.response.RegisterResponse;
import africa.semicolon.uber_deluxe.data.models.Driver;

import java.util.Optional;

public interface DriverService {
    RegisterResponse register(RegisterDriverRequest request);
    Optional<Driver> getDriverBy(Long driverId);

    void saveDriver(Driver driver);
}
