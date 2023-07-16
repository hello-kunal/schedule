package com.kunal.schedule.security.model;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class LoginRequestTest {

    @Test
    public void NonNull() {
        try {
            LoginRequest request = new LoginRequest("name", null);
            throw new RuntimeException("Shouldn't be here");
        } catch (NullPointerException e) {
            Logger.getAnonymousLogger().info(e::getMessage);
            Logger.getAnonymousLogger().info(() -> "Correctly throw exception with null values");
        }
    }

}