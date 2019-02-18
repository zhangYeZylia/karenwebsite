package com.karen.ssm.dao;

import com.karen.ssm.model.User;

/**
 * @author xsansan
 * @date 2018年8月8日
 * Description:
 */
public interface UserDao {
    public User selectUserById(Integer userId);

}
