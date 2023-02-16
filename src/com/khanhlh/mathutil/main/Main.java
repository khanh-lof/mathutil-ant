/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khanhlh.mathutil.main;

import com.khanhlh.mathutil.core.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        //testFactorialGivenRightArgumentRunsWell();
        //testFactorialGivenWrongArgumentThrowsException();
    }
    //Thiết kế hàm getF() nếu đưa n < 0 hoặc n > 20 thì hàm sẽ throw Exception
    
    //Thực tế hàm getF() khi chạy có làm đc như thết kế hay ko thì phải chạy thử
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //Test Case 4: Test getF(-5)
        //Expected: an exception is thrown
        //          IllegalArgumentException
        System.out.println("Test -5!: expected = IllegalException is thrown");
        MathUtility.getFactorial(-5);
    }
    // tên hàm bao gồm ý nghĩa của việc kiểm thử
    // hàm dưới kiểm thử với n đúng
    public static void testFactorialGivenRightArgumentRunsWell() {
        
        //Test Case #1: Test getFactorial with n = 0
        //Expected value:1 - hy vọng đưa n=0 thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                            + " | actual: " + actualValue);
        //Test case 2: Test getFactorial with n = 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n); // thực tế
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                            + " | actual: " + actualValue);
        //Test case 3: Test getFactorial(3)
        //Expected value : 6
        System.out.println("Test 3!: expected = 6"
                + " | actual: " + MathUtility.getFactorial(3));
    }
}
