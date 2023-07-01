package africa.semicolon.uber_deluxe.notification;

import africa.semicolon.uber_deluxe.data.dto.request.EmailNotificationRequest;

public interface MailService {
    String sendHtmlMail(EmailNotificationRequest request);
}
