package com.karen.ssm.dao;

import com.karen.ssm.model.User;

public interface UserDao {
    public User selectUserById(Integer userId);

}
