package com.study;

public class UserService {

    // 根据身份证id获取年龄
    public Integer getAge(String id) {
        int year = Integer.parseInt(id.substring(6, 10));
        int month = Integer.parseInt(id.substring(10, 12));
        int day = Integer.parseInt(id.substring(12, 14));
        int age = 2026 - year;
        if(month > 8) {
            age--;
        }else if(month == 8) {
            if(day > 7) {
                age--;
            }
        }
        return age;
    }

    public String getGender(String id) {
        int gender = Integer.parseInt(id.substring(16, 17));
        return gender % 2 == 0 ? "女" : "男";
    }
}
