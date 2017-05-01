package com.jixue.leetcode.solutions.list;

import com.jixue.leetcode.solutions.common.list.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jx on 17/4/30.
 *
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 */
public class RandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return head;
        }
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode curr = head;
        while(curr != null){
            map.put(curr,new RandomListNode(curr.label));
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
