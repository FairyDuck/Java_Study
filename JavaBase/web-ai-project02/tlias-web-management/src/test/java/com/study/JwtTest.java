package com.study;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {
    @Test
    public void testGenJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 10);
        claims.put("username", "study");

        String jwt = Jwts.builder().signWith(SignatureAlgorithm.HS256, "RmFpcnlEdWNr") // 签名算法和密钥
                .addClaims(claims) // 添加自定义声明
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 1000)) // 1分钟
                .compact();

        System.out.println(jwt);
    }

    @Test
    public void testParseJwt() {
        Claims claims = Jwts.parser().setSigningKey("RmFpcnlEdWNr")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MTAsInVzZXJuYW1lIjoic3R1ZHkiLCJleHAiOjE3ODY3NjExNzB9.McwoFhQq8xh3qEPvjfg0EAKhVGVheMhHs6MY_aOhtM0")
                .getBody();
        System.out.println(claims);
    }
}
