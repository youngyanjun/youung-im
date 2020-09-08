package com.young.im.config;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisTemplateConfig {
    //order
    @Value("${spring.redis.order.host}")
    private String orderHost;

    @Value("${spring.redis.order.port}")
    private String orderPort;

    @Value("${spring.redis.order.password}")
    private String orderPassword;

    //user
    @Value("${spring.redis.user.host}")
    private String userHost;

    @Value("${spring.redis.user.port}")
    private String userPort;

    @Value("${spring.redis.user.password}")
    private String userPassword;

    private static final int MAX_IDLE = 200; //最大空闲连接数
    private static final int MAX_TOTAL = 1024; //最大连接数
    private static final long MAX_WAIT_MILLIS = 10000; //建立连接最长等待时间







    //配置工厂
    public RedisConnectionFactory connectionFactory(String host, int port, String password, int maxIdle,
                                                    int maxTotal, long maxWaitMillis, int index) {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(host);
        jedisConnectionFactory.setPort(port);

        if (!StringUtils.isEmpty(password)) {
            jedisConnectionFactory.setPassword(password);
        }

        if (index != 0) {
            jedisConnectionFactory.setDatabase(index);
        }

        jedisConnectionFactory.setPoolConfig(poolConfig(maxIdle, maxTotal, maxWaitMillis, false));
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }

    //连接池配置
    public JedisPoolConfig poolConfig(int maxIdle, int maxTotal, long maxWaitMillis, boolean testOnBorrow) {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMaxTotal(maxTotal);
        poolConfig.setMaxWaitMillis(maxWaitMillis);
        poolConfig.setTestOnBorrow(testOnBorrow);
        return poolConfig;
    }


    //------------------------------------
    @Bean(name = "redisOrderTemplate")
    public StringRedisTemplate redisOrderTemplate() {
        StringRedisTemplate template = new StringRedisTemplate();
        new RedisConfig();
        template.setConnectionFactory(
                connectionFactory(orderHost, Integer.parseInt(orderPort), orderPassword, MAX_IDLE, MAX_TOTAL, MAX_WAIT_MILLIS, 0));
        return template;
    }

    //------------------------------------
    @Bean(name = "redisUserTemplate")
    public StringRedisTemplate userUserTemplate() {
        StringRedisTemplate template = new StringRedisTemplate();
        new RedisConfig();
        template.setConnectionFactory(
                connectionFactory(userHost, Integer.parseInt(userPort), userPassword, MAX_IDLE, MAX_TOTAL, MAX_WAIT_MILLIS, 0));
        return template;
    }



}
