/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khanhlh.mathutil.core.test;

import com.khanhlh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    @Test
    //trong hàm chứa test case để test getF
    //với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test getF(0)
        //Expected Value: 0! = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);

        //Test case 2: test getF with n = 5
        // Expected 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));

        //Test case 3: test getF with n = 6
        // Expected 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        //Test case 4: test getF with n = 4
        // Expected 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));

    }
    //Kiểm thử ngoại lệ thì sao
    //tức là hàm getF() đc thết kế rằng nếu đưa n cà chơn
    //hàm phải ném ra ngoại lệ
    //getF(-5) thì phải ném ra ngoại lệ
    //THấy ngoại lệ mừng rơi nước mắt
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
        //chỉ gõ lệnh trên sẽ văng Exception(màu đỏ)
        //Exception là đúng thiết kế -> màu xanh
        //-> chưa nhận nhiện là đã có ngoại lệ
        //Junit 4 không dùng hàm assert để đo ngoại lệ
        //Junit 5 thì dùng hàm assert để đo ngoại lệ
    }
}
