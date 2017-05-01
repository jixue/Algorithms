package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/30.
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode l3 = new ListNode(-1), curr3 = l3;
        int carry = 0;//进位
        while (curr1 != null || curr2.next != null){
            int sum = 0;
            if(curr1 != null){
                sum += curr1.val;
                curr1 = curr1.next;
            }
            if(curr2 != null){
                sum += curr2.val;
                curr2 = curr2.next;
            }
            ListNode node = new ListNode(sum % 10);
            curr3.next = node;
            curr3 = curr3.next;
            carry = sum / 10;
        }
        if(carry == 1){
            curr3.next = new ListNode(carry);
        }
        return l3.next;
    }
}