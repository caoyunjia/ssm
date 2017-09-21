package com.cn.web;

import com.cn.utils.Captcha;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by A on 2017/7/25.
 */
@Controller
public class CommonControl {

    /**
     * 获取验证码
     */

    public void vcode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //验证码的原理,生成验证码,保存到session里,并将图片显示回页面
        String random = RandomStringUtils.random(4, "ABCDEFGHJKMNPQRSTUVWXYZabcdefghjkmnpqrstuvwxyz123456789".toCharArray());
        Captcha.getInstance().setCode(request,random);
        Captcha.getInstance().output(random,response);


    }

/*
    public CommRspVO authCommputer(String username){
        CommRspVO commRspVO = new CommRspVO();
        //认证成功



        return commRspVO;

    }*/


}
