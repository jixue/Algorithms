package com.jixue.leetcode.solutions.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jx on 17/4/7.
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

    Find all the elements that appear twice in this array.

    Could you do it without extra space and in O(n) runtime?

    Example:
    Input:
    [4,3,2,7,8,2,3,1]

    Output:
    [2,3]
 */
public class DuplicateNumber {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums == null || nums.length == 0){
            return result;
        }
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = -nums[val];
            }else if(nums[val] < 0){
                result.add(val + 1);
            }
        }
        return result;
    }
}
