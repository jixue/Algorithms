package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        while(curr.next != null){
            if(curr.val == curr.next.val){//重复元素
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
