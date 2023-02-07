package africa.semicolon.uber_deluxe.controller;

import africa.semicolon.uber_deluxe.data.dto.request.RegisterPassengerRequest;
import africa.semicolon.uber_deluxe.data.dto.response.RegisterResponse;
import africa.semicolon.uber_deluxe.services.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/passenger")
@AllArgsConstructor
public class PassengerController {
    private final PassengerService passengerService;

    @PostMapping
    public ResponseEntity<?> register(@RequestBody RegisterPassengerRequest registerPassengerRequest){
        RegisterResponse registerResponse = passengerService.register((registerPassengerRequest));
        return ResponseEntity.status(registerResponse.getCode()).body(registerResponse);
    }
}
