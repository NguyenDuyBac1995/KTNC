package com.example.demo.Utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {

    private MyUtils myUtils;
    @BeforeEach
    void setUp() {
        myUtils = new MyUtils();
    }

    @Test
    void add() {
        assertEquals(3, myUtils.add(1, 2));
    }
}