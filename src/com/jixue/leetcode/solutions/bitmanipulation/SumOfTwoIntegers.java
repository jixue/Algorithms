package com.jixue.leetcode.solutions.bitmanipulation;

/**
 * Created by jx on 17/4/22.
 *
 * 371. Sum of Two Integers (https://leetcode.com/problems/sum-of-two-integers/#/description)
 */
public class SumOfTwoIntegers {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        if(b == 0){//b为相加的进位值
            return a;
        }
        int sum = a ^ b;//相加
        int carry = (a & b) << 1;//进位值
        return getSum(sum, carry);
    }
}