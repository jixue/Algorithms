package com.jixue.leetcode.solutions.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jx on 17/4/5.
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

    Example:

    Input:
    [4,3,2,7,8,2,3,1]

    Output:
    [5,6]

 448.Find All Numbers Disappeared in an Array(https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/#/description)
 */
public class DisappearedNumbers {

    /**
     * 将数组中的各个元素的值转化成数组的下标元素;
     * 遍历一次数组,如果该下标元素值大于0,转化成负数;如果元素值小于0,不变
     * 遍历完一次后,再遍历一次数组,这时候数组中值大于0对应的下标即没有出现的元素,因为如果该元素有出现的话,元素下标对应的元素值应该为负数
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = (nums[index] > 0) ? -nums[index] : nums[index];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }
        return result;
    }
}
