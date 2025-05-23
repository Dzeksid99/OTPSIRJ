package org.Galushka.dao;

import org.Galushka.model.OTPCode;

public interface OtpCodeDao {
    void addOTPCode(OTPCode otpCode);
    OTPCode getOTPCodeById(int id);
    void updateStatus(int id, String status);

    // Метод для получения активного OTP-кода по ID пользователя
    OTPCode getActiveOTPByUserId(int userId);
}
