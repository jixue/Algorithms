package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

import java.util.Stack;

/**
 * Created by jx on 17/5/1.
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 * Example:
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4),Output: 7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        while(l1 != null){
            stack1.push(l1);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2);
            l2 = l2.next;
        }

        ListNode l3 = new ListNode(-1), curr = l3;
        int sum = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            if(!stack1.isEmpty()){
                sum += stack1.pop().val;
            }
            if(!stack2.isEmpty()){
                sum += stack2.pop().val;
            }
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = l3.next;
            l3.next = newNode;
            sum = sum / 10;
        }
        if(sum == 1){
            ListNode newNode = new ListNode(sum);
            newNode.next = l3.next;
            l3.next = newNode;
        }
        return l3.next;
    }
}
