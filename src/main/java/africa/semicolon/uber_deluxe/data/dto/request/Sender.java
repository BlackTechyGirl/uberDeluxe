package africa.semicolon.uber_deluxe.data.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Sender {
    private String name;
    private String email;
}
