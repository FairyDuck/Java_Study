package com.study.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private int id; // 编号
    private int index; // 位置
}
