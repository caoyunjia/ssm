package com.cn.common;

import com.cn.service.ICommonService;
import com.cn.service.IUserService;
import com.cn.utils.AuthUtils;
import com.cn.utils.CommonUtils;
import com.cn.vo.AuthVo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Calendar;
import java.util.Date;

/**
 * Junit单元测试是基于Spring   注解式
 * @author lx
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class SpringJunitTest {
    @Autowired
    private IUserService userService;
    @Autowired
    private ICommonService iCommonService;

    @Before
    public void init(){
       
    }

    @Test
    public void test1(){
/*        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        User user1 = userService.login(user);
        System.out.println(user1.getType());*/
        AuthVo authVo = new AuthVo();
        authVo.setUsername("wangwu");
        iCommonService.insertAuth(authVo);

    }

    @Test
    public void test2(){
        AuthVo authVo = new AuthVo();
        authVo.setUsername("lisi");
        AuthVo auth = iCommonService.auth(authVo);

        if (auth != null && "1".equals(auth.getStatus())) {
            //根据用户名查询到该用户,如果有并且认证信息为1,则表示已经登录
            System.out.println("成功了");
        }else{
            //如果数据为空,证明该用户没有认证过
            if(auth==null){
                //认证
                boolean b = AuthUtils.toAuth();
                AuthVo authVo1=new AuthVo();
                authVo1.setUsername("lisi");
                authVo1.setAuthDate("20170804");
                if(b){
                    //如果认证成功,向数据库新增一条数据,status为1
                    authVo1.setStatus("1");
                    authVo1.setAuthCount(0);
                }else{
                    //如果认证失败,向数据库新增一条数据,status为0
                    authVo1.setStatus("0");
                    authVo1.setAuthDate("null");
                    authVo1.setAuthCount(1);
                }
                iCommonService.insertAuth(authVo1);
            }else{
                //能查到该用户,但认证信息中status不为1,证明该用户曾经认证过,但认证失败
                AuthVo auth2= new AuthVo();
                auth2.setAuthDate(CommonUtils.now8());
                auth2.setStatus("0");
                auth2.setUsername("lisi");
               Integer count= iCommonService.findTodayCount(auth2); //查询不是今天的激活次数
               if(count==null){
                   //证明已经没有激活次数
                   System.out.println("请明天再登录");
               }else{
                   //如果查询当天的数据不为空,证明今天有激活次数
                   if(count!=3){
                       //次数为3次以下
                       boolean b = AuthUtils.toAuth();
                       //认证成功
                       if(b){
                           //执行插入
                           System.out.println("成功");
                           AuthVo authVo1=new AuthVo();
                           authVo1.setUsername("lisi");
                           authVo1.setAuthDate(CommonUtils.now8());
                           authVo1.setStatus("1");
                           authVo1.setAuthCount(1);
                           iCommonService.updateAuth(authVo1);
                       }else{
                           //认证失败,count+1
                           AuthVo authVo1=new AuthVo();
                           authVo1.setUsername("lisi");
                           authVo1.setAuthDate("null");
                           authVo1.setStatus("0");
                           authVo1.setAuthCount(count+1);
                           iCommonService.updateAuth(authVo1);
                       }
                }else{
                    //当count=3,最后一次认证
                    boolean b = AuthUtils.toAuth();
                    if(b){
                        //认证成功
                        AuthVo authVo1=new AuthVo();
                        authVo1.setUsername("lisi");
                        authVo1.setAuthDate("20170804");
                        authVo1.setStatus("1");
                        authVo1.setAuthCount(0);
                        iCommonService.updateAuth(authVo1);
                    }else{
                        //认证失败,把认证时间设置当天时间,并将值初始化为0
                        AuthVo authVo1=new AuthVo();
                        authVo1.setUsername("lisi");
                        authVo1.setAuthDate("20170804");
                        authVo1.setStatus("0");
                        authVo1.setAuthCount(0);
                        iCommonService.updateAuth(authVo1);
                    }

                } }

            }

        }



        }

    @Test
    public void test3() {
        AuthVo authVo = new AuthVo();
        authVo.setUsername("wangwu");
        AuthVo auth = iCommonService.auth(authVo);
        if (auth != null && "1".equals(auth.getStatus())) {

        }


    }


    @Autowired
    private ShardedJedisPool jedisPool;

   @Test
    public void test4(){
       ShardedJedis jedis = jedisPool.getResource();
     //  jedis.set("key1","111");
       String key1 = jedis.get("key1");
       System.out.println(key1);
   }

    @Test
    public void test5(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR, 1);
        Date newDate = cal.getTime();
 //       System.out.println(newDate);
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);


    }

}
