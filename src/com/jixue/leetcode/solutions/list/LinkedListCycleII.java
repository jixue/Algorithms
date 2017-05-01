package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/30.
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class LinkedListCycleII {

    /**
     * 链表起点为A点,环入口为B点,快慢节点相遇点为C点;
     * 设AB距离为l,BC距离为a,环长度为r,假定相遇时快指针fast已走了n圈,慢指针slow走了m圈,n>m;
     * 因为快指针路程为慢指针的两倍,则l+a+nr = 2*(l+a+mr),推出l=(n-2m)r-a;
     * 经分析,若n-2m=0,则l和a只能均为0,即环入口为链表起点;
     * 若n-2m>0,设n-2m=N(N为正整数),l=(N-1)r+r-a,即环入口距离和相遇节点到环入口的距离
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){//有环
                ListNode curr = head;
                while(curr != slow){
                    curr = curr.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
