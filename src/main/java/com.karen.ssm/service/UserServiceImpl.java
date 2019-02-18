package com.karen.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karen.ssm.dao.UserDao;
import com.karen.ssm.model.User;

/**
 * @author xsansan
 * @date 2018年8月8日
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);

    }
}