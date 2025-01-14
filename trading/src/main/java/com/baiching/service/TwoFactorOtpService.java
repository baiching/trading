package com.baiching.service;

import com.baiching.model.TwoFactorOTP;
import com.baiching.model.User;

public interface TwoFactorOtpService {
    TwoFactorOTP createTwoFactorOtp(User user,String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP, String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
