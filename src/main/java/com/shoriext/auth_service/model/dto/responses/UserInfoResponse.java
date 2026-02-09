package com.shoriext.auth_service.model.dto.responses;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserInfoResponse {

    private Long id;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private boolean emailVerified;
    private LocalDateTime lastLogin;
    private LocalDateTime createdAt;
}