package com.aboback.binary_tree.day1;

import com.aboback.binary_tree.TreeNode;

/**
 * 一棵二叉树共有几个节点
 *
 * @author jhb
 * @date 2020/12/04
 */
public class Demo1 {

    private int count(TreeNode treeNode) {

        if (treeNode == null) return 0;

        // 自己加上子树的节点数就是整棵树的节点数
        return 1 + count(treeNode.left) + count(treeNode.right);
    }

}
