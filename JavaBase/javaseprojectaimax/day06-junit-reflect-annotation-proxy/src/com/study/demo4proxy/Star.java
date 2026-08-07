package com.study.demo4proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService{
    private String name;

    @Override
    public void sing(String name) {
        System.out.println("明星正在唱" + name + "歌...");
    }

    @Override
    public String dance() {
        System.out.println("明星正在跳舞...");
        return "谢谢";
    }
}
