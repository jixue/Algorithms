package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 *
 * 141. Linked List Cycle (https://leetcode.com/problems/linked-list-cycle/#/description)
 */
public class LinkedListCycle {

    /**
     * 取一个慢指针slow,快指针fast;
     * slow每次走一步,fast每次走两步,如果遍历没有结束时slow和fast相等说明链表有环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
