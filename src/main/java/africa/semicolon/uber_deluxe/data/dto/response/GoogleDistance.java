package africa.semicolon.uber_deluxe.data.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GoogleDistance {
    private String text;
    private Long value;
}
