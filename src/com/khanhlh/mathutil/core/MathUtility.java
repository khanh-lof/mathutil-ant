/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khanhlh.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //hàm tính N! = 1x2x3x4x5....xN
    //Ko có giai thừa âm
    //0! = 1! = 1
    //vì giai thừa tăng giá rất nhanh, 20! vừa đủ 18 số 0
    //Quy ước: hàm này chỉ tính từ 0..20!
    // có 2 cách viết làm này for truyền thống và đệ quy - recursion
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //n2..20
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
