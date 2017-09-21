package com.cn.web;

import com.cn.service.ICommonService;
import com.cn.service.IUserService;
import com.cn.vo.AuthVo;
import com.cn.vo.CommRspHeader;
import com.cn.vo.CommRspVO;
import com.cn.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by A on 2017/7/25.
 */
@Controller
@RequestMapping("user")
public class UserControl {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private ICommonService iCommonService;
    private final  static String USER_KEY="LOGINUSER";
    /**
     * 登录操作
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public CommRspVO login(@RequestBody User user, HttpServletRequest req) {
        CommRspVO commRspVO = new CommRspVO();
        CommRspHeader header = new CommRspHeader();
        User loginUser = iUserService.login(user);
        if(loginUser==null){
            //账号或者密码有误
            header.set_rd("0001");
            header.set_rm("账号或密码有误");
        }else{
            header.set_rd("0000");
            header.set_rm("登录成功");
            commRspVO.setObject(user);
            //将数据存入session
            req.getSession().setAttribute(USER_KEY+user.getUsername(),user);

        }
        System.out.println("5213");
        commRspVO.setHead(header);
        return commRspVO;
    }
   @RequestMapping("authUser")
   @ResponseBody
   public CommRspVO authUser(AuthVo  authVo){
        //认证方法
       CommRspVO commRspVO = new CommRspVO();
       CommRspHeader commRspHeader = new CommRspHeader();
       AuthVo auth = iCommonService.auth(authVo);
       return commRspVO;

   }

}
