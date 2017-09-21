package com.cn.service;

import com.cn.vo.AuthVo;

/**
 * Created by A on 2017/7/26.
 */
public interface ICommonService {

    AuthVo auth(AuthVo authVo);

   Integer findTodayCount(AuthVo authVo);

   void insertAuth(AuthVo authVo);

   void updateAuth(AuthVo authVo);
}
