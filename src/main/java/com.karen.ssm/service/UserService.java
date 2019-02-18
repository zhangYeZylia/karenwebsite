package com.karen.ssm.service;

import com.karen.ssm.model.User;

/**
 * @author xsansan
 * @date 2018年8月8日
 * Description:
 */
public interface UserService {
    User selectUserById(Integer userId);
}
