package com.winning.kbms.core.cache;


/**
 * author：qiushengming
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

public class RedisCacheTransfer {

    private static final Logger logger =
        LoggerFactory.getLogger(RedisCacheTransfer.class);

    @Autowired
    public void setJedisConnectionFactory(
        JedisConnectionFactory jedisConnectionFactory) {
        logger.info("静态注入");
        MybatisRedisCache.setJedisConnectionFactory(jedisConnectionFactory);
    }

}
