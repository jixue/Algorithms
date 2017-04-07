package com.jixue.leetcode.solutions.array;

/**
 * Created by jx on 17/4/4.
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.

    Example 1:
    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s.The maximum number of consecutive 1s is 3.

    Note:
    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {

    /**
     * 采用两个累计变量来实现,count用于累计当前连续1的个数,result为当前最大的连续1的个数
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count = 0, result = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == 1){
                count++;
                result = Math.max(count, result);
            }else{
                count = 0;
            }
        }
        return result;
    }
}
