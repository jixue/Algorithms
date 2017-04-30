package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 *
 * 21. Merge Two Sorted Lists (https://leetcode.com/problems/merge-two-sorted-lists/#/description)
 */
public class MergeSortedList {
    public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);//新链表
        ListNode curr = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 == null){
            curr.next = l2;
        }
        if(l2 == null){
            curr.next = l1;
        }
        return head.next;
    }
}