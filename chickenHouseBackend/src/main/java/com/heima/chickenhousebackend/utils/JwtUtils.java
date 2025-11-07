package com.heima.chickenhousebackend.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtils {

    //密钥
    private static final String SECRET_KEY = "eWFuZ3lhbmc=";  //`yangyang`的base64编码

    //设置令牌过期时间
    private static final long EXPIRATION_TIME = 12*60*60*1000;

    //生成JWT令牌
    public static String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,SECRET_KEY)  //指定加密算法及密钥
                .addClaims(claims) //添加自定义信息
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) //设置过期时间
                .compact(); //生成令牌
    }

    //解析JWT令牌
    public static Claims parseToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY) //指定密钥
                .parseClaimsJws(token) //解析令牌
                .getBody(); //获取自定义信息
    }

}
