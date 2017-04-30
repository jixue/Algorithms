package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *For example, the following two linked lists:
 <pre>
 A:        a1 → a2
                  ↘
                  c1 → c2 → c3
                  ↗
 B:   b1 → b2 → b3
 </pre>
 * begin to intersect at node c1.
 */
public class IntersectionNode {

    /**
     * 需要两次循环遍历;
     * 第一次遍历消除了两个链表长度的差异,第二次遍历查找相交的节点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode currA=headA;
        ListNode currB=headB;
        while(currA != currB){
            currA = (currA == null) ? headB : currA.next;
            currB = (currB == null) ? headA : currB.next;
        }
        return currA;
    }
}