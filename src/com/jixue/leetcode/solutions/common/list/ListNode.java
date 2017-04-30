package com.jixue.leetcode.solutions.common.list;

/**
 * Created by jx on 17/4/29.
 */
public class ListNode {
    public int val;//节点值
    public ListNode next;//下一个节点

    public ListNode(int val){
        this.val = val;
    }

    public static void printLinkedList(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "\t");
            curr = curr.next;
        }
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
