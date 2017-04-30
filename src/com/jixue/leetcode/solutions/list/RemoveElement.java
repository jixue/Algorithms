package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Exampl:
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode prev = first;
        ListNode curr = head;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = prev.next;
            }else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return first.next;
    }
}
