package com.kunal.schedule.security.model;

import lombok.Builder;

import java.util.List;

@Builder
public class LoginResponse {
    private final String token;
    private final String username;
    private final List<String> roles;
}