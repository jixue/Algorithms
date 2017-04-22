package com.jixue.leetcode.solutions.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by jx on 17/4/22.
 *
 * 496. Next Greater Element I (https://leetcode.com/problems/next-greater-element-i/#/description)
 */
public class NextGreaterNumI {

    /**
     * 构造一个map,key为数值,value为该key值在后一个数组中next greater element
     * @param findNums
     * @param nums
     * @return
     */
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int len1 = findNums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(len1);
        Stack<Integer> stack = new Stack<Integer>();
        for(int num : nums){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        int[] result = new int[len1];
        for(int i = 0; i < len1; i++){
            int num = findNums[i];
            if(map.containsKey(num)){
                result[i] = map.get(num);
            }else{
                result[i] = -1;
            }
        }
        return result;
    }
}