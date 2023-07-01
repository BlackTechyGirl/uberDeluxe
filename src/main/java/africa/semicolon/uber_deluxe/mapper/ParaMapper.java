package africa.semicolon.uber_deluxe.mapper;

import africa.semicolon.uber_deluxe.data.dto.request.RegisterPassengerRequest;
import africa.semicolon.uber_deluxe.data.models.AppUser;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ParaMapper {
    public static AppUser map(RegisterPassengerRequest request){
        AppUser appUser = new AppUser();
        appUser.setName(request.getName());
        appUser.setPassword(request.getPassword());
        appUser.setEmail(request.getEmail());
        return appUser;
    }
}
