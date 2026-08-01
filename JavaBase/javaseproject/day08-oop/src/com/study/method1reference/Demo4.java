package com.study.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    static void main(String[] args) {
        // 构造器引用
        CarFactory carFactory = new CarFactory() {
            @Override
            public Car getCar(String name) {
                return new Car(name);
            }
        };

        CarFactory carFactory1 = (name) -> new Car(name);
        CarFactory carFactory2 = Car::new; // 构造器引用
    }
}

interface CarFactory {
    Car getCar(String name);
}

@NoArgsConstructor
@Data
@AllArgsConstructor
class Car {
    private String name;
}