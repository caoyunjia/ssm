package com.cn.service.Impl;

import com.cn.mapper.AuthMapper;
import com.cn.service.ICommonService;
import com.cn.vo.AuthVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by A on 2017/7/26.
 */
@Service
public class CommonServiceImpl implements ICommonService {
    @Autowired
    private AuthMapper authMapper;

    public AuthVo auth(AuthVo authVo) {
        return authMapper.findByCondition(authVo);
    }

    public Integer findTodayCount(AuthVo authVo) {
        return authMapper.findTodayCount(authVo);
    }

    public void insertAuth(AuthVo authVo) {
        //执行插入操作
        authMapper.insertAuth(authVo);
    }

    public void updateAuth(AuthVo authVo) {
        authMapper.updateAuth(authVo);
    }
}
