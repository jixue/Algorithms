package com.jixue.leetcode.solutions.twopointers;

/**
 * Created by jx on 17/4/23.
 *
 * 283. Move Zeroes](https://leetcode.com/problems/move-zeroes/#/description)
 */
public class MoveZeros {

    /**
     * 使用一个累计变量index计算数组不是0的个数减去1
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int index = 0;//记录不是0的数组的索引
        for(int num : nums){
            if(num != 0){
                nums[index] = num;
                index ++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index ++;
        }
    }
}
