package africa.semicolon.uber_deluxe.services;

import africa.semicolon.uber_deluxe.data.dto.request.InviteAdminRequest;
import africa.semicolon.uber_deluxe.data.dto.response.ApiResponse;

import java.util.Set;

public interface AdminService {
    ApiResponse sendInviteRequests(Set<InviteAdminRequest> inviteAdminRequestList);

}
