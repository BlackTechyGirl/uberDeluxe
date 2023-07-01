package africa.semicolon.uber_deluxe.services;

import africa.semicolon.uber_deluxe.data.dto.response.ApiResponse;
import africa.semicolon.uber_deluxe.data.models.AppUser;
import org.springframework.web.multipart.MultipartFile;

public interface AppUserService {
    ApiResponse uploadProfileImage(MultipartFile profileImage, Long userId);

    ApiResponse verifyAccount(Long userId, String token);


    AppUser getByEmail(String email);
}
