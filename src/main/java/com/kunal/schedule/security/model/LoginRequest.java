package com.kunal.schedule.security.model;

import lombok.NonNull;

public record LoginRequest(@NonNull String userName, @NonNull String password) {
}
