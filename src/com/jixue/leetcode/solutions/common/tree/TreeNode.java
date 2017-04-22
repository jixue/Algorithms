package com.jixue.leetcode.solutions.common.tree;

/**
 * Created by jx on 17/4/22.
 */
public class TreeNode {
    TreeNode left;//左节点
    TreeNode right;//右节点
    int val;//节点值

    public TreeNode(int val){
       this. val = val;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }
}
