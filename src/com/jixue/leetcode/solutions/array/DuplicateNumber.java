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

 442.Find All Duplicates in an Array(https://leetcode.com/problems/find-all-duplicates-in-an-array/#/description)
 */
public class DuplicateNumber {

    /**
     * 转化成元素下标来实现;
     * 遍历数组,如果下标对应数组元素大于0,说明该元素目前出现一次,对应元素值变成负数;
     * 如果元素小于0,说明前面遍历过程中元素已经出现过一次,现在又遍历到,因此该元素出现两次,即重复元素.
     * @param nums
     * @return
     */
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
