package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode first = null;
        while(head != null){
            ListNode next = head.next;
            head.next = first;
            first = head;
            head = next;
        }
        return first;
    }
}
