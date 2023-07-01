package africa.semicolon.uber_deluxe.services;


import africa.semicolon.uber_deluxe.data.dto.request.EmailNotificationRequest;
import africa.semicolon.uber_deluxe.data.dto.request.InviteAdminRequest;
import africa.semicolon.uber_deluxe.data.dto.request.Recipient;
import africa.semicolon.uber_deluxe.data.dto.response.ApiResponse;
import africa.semicolon.uber_deluxe.data.models.Admin;
import africa.semicolon.uber_deluxe.data.models.AppUser;
import africa.semicolon.uber_deluxe.data.repositories.AdminRepository;
import africa.semicolon.uber_deluxe.exception.BusinessLogicException;
import africa.semicolon.uber_deluxe.notification.MailService;
import africa.semicolon.uber_deluxe.util.AppUtilities;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService{

    private final AdminRepository adminRepository;
    private final MailService mailService;
    @Override
    public ApiResponse sendInviteRequests(Set<InviteAdminRequest> inviteAdminRequestList) {
        EmailNotificationRequest request = new EmailNotificationRequest();
        var recipients = inviteAdminRequestList.stream()
                .map(inviteAdminRequest -> createAdminProfile(inviteAdminRequest))
                .map(inviteAdminRequest -> new Recipient(inviteAdminRequest.getUserDetails().getName(), inviteAdminRequest.getUserDetails().getEmail()))
                .toList();
        request.getTo().addAll(recipients);

        String adminMail = AppUtilities.getAdminMailTemplate();
        request.setHtmlContent(String.format(adminMail, "admin", AppUtilities.generateVerificationLink(0L)));
        var response = mailService.sendHtmlMail(request);
        if (response!=null) return ApiResponse.builder().message("invite requests sent").build();
        throw new BusinessLogicException("invite requests sending failed");
    }


    private Admin createAdminProfile(InviteAdminRequest inviteAdminRequest) {
        Admin admin = new Admin();
        admin.setUserDetails(new AppUser());
        admin.getUserDetails().setName(inviteAdminRequest.getName());
        admin.getUserDetails().setEmail(inviteAdminRequest.getEmail());
        adminRepository.save(admin);
        return admin;
    }
}
