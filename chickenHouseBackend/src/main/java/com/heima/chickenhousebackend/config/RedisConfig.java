package com.heima.chickenhousebackend.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    
    private static final Logger log = LoggerFactory.getLogger(RedisConfig.class);

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {

        log.info("开始创建Redis模板对象...");
        RedisTemplate<String, Object> template = new RedisTemplate<>();

        //设置Redis连接工厂对象
        template.setConnectionFactory(redisConnectionFactory);
        //设置Redis key的序列化器
        template.setKeySerializer(new StringRedisSerializer());

        return template;
    }
}
