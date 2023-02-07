package africa.semicolon.uber_deluxe.services;

import africa.semicolon.uber_deluxe.data.dto.request.RegisterPassengerRequest;
import africa.semicolon.uber_deluxe.data.dto.response.RegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PassengerServiceImplTest {
    @Autowired
    private PassengerService passengerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void register() {
        RegisterPassengerRequest request =  new RegisterPassengerRequest();
        request.setEmail("test@email.com");
        request.setPassword("testPassword");
        request.setName("Amirah Tinubu");

        RegisterResponse registerResponse = passengerService.register(request);
        assertThat(registerResponse).isNotNull();
        assertThat(registerResponse.getCode()).isEqualTo(HttpStatus.CREATED .value());
    }
}




