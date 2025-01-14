package com.baiching.service;

import com.baiching.domain.VerificationType;
import com.baiching.model.User;

public interface UserService {

    public User findUserByJwt(String jwt) throws Exception;
    public User findUserEmail(String email) throws Exception;
    public User findUserById(Long userId) throws Exception;

    public User enableTwoFactorAuthentication(VerificationType verificationType,
                                              String sendTo,
                                              User user);

    User updatePassword(User user, String newPassword);
}
