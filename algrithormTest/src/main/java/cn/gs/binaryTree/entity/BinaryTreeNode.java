package cn.gs.binaryTree.entity;

import lombok.Data;

/**
 * 二叉树节点
 * @Author: gaoshuai
 * @Date: 2018/10/9 15:40
 * @Version 1.0
 */
@Data
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        super();
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
