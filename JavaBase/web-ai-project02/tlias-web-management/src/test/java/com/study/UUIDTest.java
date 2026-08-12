package com.study;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDTest {

    @Test
    public void testUUID() {
        for(int i = 0; i < 100; i++)
            System.out.println(UUID.randomUUID());
    }
}
