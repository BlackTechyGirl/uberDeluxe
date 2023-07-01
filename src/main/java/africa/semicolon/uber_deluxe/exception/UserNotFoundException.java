package africa.semicolon.uber_deluxe.exception;

public class UserNotFoundException extends BusinessLogicException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
