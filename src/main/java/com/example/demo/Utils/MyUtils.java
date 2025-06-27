package com.example.demo.Utils;

public class MyUtils {


    public int tinhTongCacSoChiaHetCho3(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phải là số nguyên dương");
        }
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
