package com.aboback.binary_tree.day1;

import com.aboback.binary_tree.TreeNode;

/**
 * 力扣第 116 题
 * 填充二叉树节点的右侧指针
 *
 * @author jhb
 * @date 2020/12/04
 */
public class Demo3 {

    private TreeNode connect(TreeNode root) {
        if (root == null) return null;
        connectTwoNode(root.left, root.right);
        return root;

    }

    private void connectTwoNode(TreeNode node1, TreeNode node2) {

        if (node1 == null || node2 == null) return;

        //前序遍历
        // 将传入的两个节点连接
        node1.next = node2;

        // 连接相同父节点的两个子节点
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);

        // 连接跨越父节点的两个子节点
        connectTwoNode(node1.right, node2.left);


    }


}
