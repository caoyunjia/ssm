package com.cn.mapper;

import com.cn.vo.AuthVo;

/**
 * Created by A on 2017/8/3.
 */
public interface AuthMapper {

    AuthVo findByCondition(AuthVo authVo);

    Integer findTodayCount(AuthVo authVo);

    void insertAuth(AuthVo authVo);

    void updateAuth(AuthVo authVo);
}
