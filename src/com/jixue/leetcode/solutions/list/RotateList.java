package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/30.
 *
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,将倒数k个节点移到链表前端
 * return 4->5->1->2->3->NULL.
 */
public class RotateList {
    /**
     * 将倒数k个节点移到链表前端
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode prev = new ListNode(-1);//头节点的前一个节点
        prev.next = head;
        ListNode rotate = prev, last = prev;
        int len = 0;
        while(last.next != null){//求链表长度
            last = last.next;//last为尾节点
            len ++;
        }
        for(int j = len - k % len; j > 0; j--){
            rotate = rotate.next;//找到需要旋转节点的前一个节点,即倒数第k+1个节点
        }
        //移位
        last.next = prev.next;
        prev.next = rotate.next;
        rotate.next = null;
        return prev.next;
    }
}
