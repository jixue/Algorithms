package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.ListNode;

/**
 * Created by jx on 17/4/29.
 * 判断LinkedList是否是回文链表
 */
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        //找到中间节点
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){//链表为奇数个数节点,获取中间节点的下一个节点
            slow = slow.next;
        }

        slow = reverse(slow);//倒装后半部分链表
        fast = head;
        while(slow != null){
            if(slow.val != fast.val){//如果不相等则不是回文链表
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    /**
     * 逆序链表
     * @param head
     * @return
     */
    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}