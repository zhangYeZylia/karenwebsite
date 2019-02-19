package com.karen.ssm.service;

import com.karen.ssm.model.User;

public interface UserService {
    User selectUserById(Integer userId);
}
