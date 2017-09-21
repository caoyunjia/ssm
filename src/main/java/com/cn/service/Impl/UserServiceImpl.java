package com.cn.service.Impl;

import com.cn.mapper.UserMapper;
import com.cn.service.IUserService;
import com.cn.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by A on 2017/7/26.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.findUserByUsernameAndPassword(user);
    }
}
