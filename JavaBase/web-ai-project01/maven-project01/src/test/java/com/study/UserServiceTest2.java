package com.study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceTest2 {
    private UserService userService = new UserService();
    @BeforeEach
    public void init() {
        userService = new UserService();
    }
    @Test
    @DisplayName("null")
    public void testGetGender() {
        Assertions.assertThrows(NullPointerException.class, () -> userService.getGender(null));
    }

    @Test
    @DisplayName("长度小于17")
    public void testGetGender2() {
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> userService.getGender("1000002000100110"));
    }
//    @Test
//    @DisplayName("长度大于17")
//    public void testGetGender3() {
//        Assertions.assertThrows(IllegalAccessError.class, () -> userService.getGender("1000002000100110111"));
//    }
    @Test
    @DisplayName("正常男性")
    public void testGetGender4() {
        String sex = userService.getGender("100000200010011011");
        Assertions.assertEquals("男", sex);
    }
    @Test
    @DisplayName("正常女性")
    public void testGetGender5() {
        String sex = userService.getGender("100000200010011000");
        Assertions.assertEquals("女", sex);
    }


}
