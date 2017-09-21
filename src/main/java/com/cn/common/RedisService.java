package com.cn.common;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by A on 2017/9/5.
 */
public class RedisService {
 //   注入jedisPool
    @Autowired(required =false)
    private ShardedJedisPool shardedJedisPool;

    //写一个通用的方法,根据不同的类型返回不同的值

    //通过Key获取redis的value
    public  void  setKey(String key,String value){
        ShardedJedis jedis =null;
        try {
            jedis=shardedJedisPool.getResource();
            jedis.set(key, value);
        }finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    //通过Key获取value
    public String getKey(String key) {
        ShardedJedis jedis = null;
        try {
            jedis = shardedJedisPool.getResource();
            return jedis.get(key);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
