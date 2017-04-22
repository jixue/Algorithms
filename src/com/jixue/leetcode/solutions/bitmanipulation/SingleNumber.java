package com.jixue.leetcode.solutions.bitmanipulation;

/**
 * Created by jx on 17/4/22.
 *
 * 136. Single Number (https://leetcode.com/problems/single-number/#/description)
 */
public class SingleNumber {

    /**
     * a^b^a = b
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int result = 0;
        for(int n : nums){
            result ^= n;
        }
        return result;
    }
}
