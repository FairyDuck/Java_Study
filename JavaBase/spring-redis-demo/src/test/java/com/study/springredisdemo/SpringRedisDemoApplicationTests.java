package com.study.springredisdemo;


import com.study.springredisdemo.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringRedisDemoApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void testString() {
        redisTemplate.opsForValue().set("name", "zhangsan");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }

    @Test
    void testSaveUser() {
        User user = new User("zhangsan", 20);
        redisTemplate.opsForValue().set("user", user);
        User user2 = (User) redisTemplate.opsForValue().get("user");
//        Object user2 = redisTemplate.opsForValue().get("user");
        System.out.println(user2);
    }

}
