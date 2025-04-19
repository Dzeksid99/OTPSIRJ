package org.Galushka.service;

public interface NotificationService {
    void sendOTP(String destination, String otpCode);
}
