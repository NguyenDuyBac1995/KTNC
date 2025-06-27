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
    void testTongCacSoDuoi3() {
        assertEquals(0, myUtils.tinhTongCacSoChiaHetCho3(1));
        assertEquals(0, myUtils.tinhTongCacSoChiaHetCho3(2));
    }

    @Test
    void testTongCacSoDen3() {
        assertEquals(3, myUtils.tinhTongCacSoChiaHetCho3(3));
    }

    @Test
    void testTongCacSoDen6() {
        assertEquals(9, myUtils.tinhTongCacSoChiaHetCho3(6));
    }


    @Test
    void testTongCacSoDen10() {
        assertEquals(18, myUtils.tinhTongCacSoChiaHetCho3(10));
    }

    @Test
    void testTongCacSoDen15() {
        assertEquals(45, myUtils.tinhTongCacSoChiaHetCho3(15));
    }

    @Test
    void testTongCacSoDen100() {
        assertEquals(1683, myUtils.tinhTongCacSoChiaHetCho3(100));
    }

    @Test
    void testTongCacChiHetCho3VoiSoAm() {
        assertThrows(IllegalArgumentException.class, () -> {
            myUtils.tinhTongCacSoChiaHetCho3(-5);
        });
    }


}