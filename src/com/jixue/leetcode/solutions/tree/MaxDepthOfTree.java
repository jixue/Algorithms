package com.jixue.leetcode.solutions.tree;

import com.jixue.leetcode.solutions.common.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by jx on 17/4/22.
 *
 * 104. Maximum Depth of Binary Tree (https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description)
 */
public class MaxDepthOfTree {

    /**
     * 深度遍历
     * @param root
     * @return
     */
    public int maxDepthDFS(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxDepth = 1;
        Stack<TreeNode> nodes = new Stack<TreeNode>();//存放节点
        Stack<Integer> depth = new Stack<Integer>();//存放深度
        nodes.push(root);
        depth.push(maxDepth);

        while(!nodes.isEmpty()){
            TreeNode curr = nodes.pop();
            int tempDepth = depth.pop();
            if(curr.getLeft() == null && curr.getRight() == null){
                maxDepth = Math.max(maxDepth, tempDepth);
            }
            if(curr.getLeft() != null){
                nodes.push(curr.getLeft());
                depth.push(tempDepth + 1);
            }
            if(curr.getRight() != null){
                nodes.push(curr.getRight());
                depth.push(tempDepth + 1);
            }
        }
        return maxDepth;
    }

    /**
     * 广度遍历
     * @param root
     * @return
     */
    public int maxDepthBFS(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxDepth = 0;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();//存放节点
        nodes.offer(root);

        while(!nodes.isEmpty()){
            int size = nodes.size();
            while(size -- > 0){
                TreeNode curr = nodes.poll();
                if(curr.getLeft() != null){
                    nodes.offer(curr.getLeft());
                }
                if(curr.getRight() != null){
                    nodes.offer(curr.getRight());
                }
            }
            maxDepth ++;
        }
        return maxDepth;
    }
}
