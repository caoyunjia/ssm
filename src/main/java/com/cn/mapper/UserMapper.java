package com.cn.mapper;

import com.cn.vo.User;

/**
 * Created by A on 2017/7/26.
 */
public interface UserMapper {

    //根据用户名查找用户
    User findUserByUsernameAndPassword(User user);



}
