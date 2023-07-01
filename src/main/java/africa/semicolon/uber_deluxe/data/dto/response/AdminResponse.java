package africa.semicolon.uber_deluxe.data.dto.response;

import africa.semicolon.uber_deluxe.data.models.AppUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminResponse {
    private Long employeeId;
    private AppUser userDetails;
}
