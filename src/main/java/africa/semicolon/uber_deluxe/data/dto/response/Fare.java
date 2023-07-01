package africa.semicolon.uber_deluxe.data.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Fare {
    private String currency;
    private double value;

    private String text;
}
