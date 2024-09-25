package com.danioclana.user_service.dtos;

public record LoginDTO(
    String email,
    String password
) {
    public LoginDTO {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
    }

}
