package com.study.springredisdemo;


import com.study.springredisdemo.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import tools.jackson.databind.ObjectMapper;

import java.util.Map;

@SpringBootTest
class RedisStringTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    void testString() {
        stringRedisTemplate.opsForValue().set("name", "zhangsan");
        Object name = stringRedisTemplate.opsForValue().get("name");
        System.out.println(name);
    }

    @Test
    void testSaveUser() {
        //创建对象
        User user = new User("zhangsan", 20);
        //手动序列化
        String json = mapper.writeValueAsString(user);
        stringRedisTemplate.opsForValue().set("user", json);
        String jsonUser = stringRedisTemplate.opsForValue().get("user");
//        Object user2 = redisTemplate.opsForValue().get("user");
        User user1 = mapper.readValue(jsonUser, User.class);
        System.out.println(user1);
    }

    @Test
    void testHash() {
        stringRedisTemplate.opsForHash().put("user1", "name", "zhangsan");
        stringRedisTemplate.opsForHash().put("user1", "age", "20");

        Map<Object, Object> user1 = stringRedisTemplate.opsForHash().entries("user1");
        System.out.println(user1);

        Object name = stringRedisTemplate.opsForHash().get("user1", "name");
        Object age = stringRedisTemplate.opsForHash().get("user1", "age");
        System.out.println(name + " " + age);
    }

}
