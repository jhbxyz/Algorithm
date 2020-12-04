package com.aboback.binary_tree.day1;

import com.aboback.binary_tree.TreeNode;

/**
 * 一棵二叉树共有几个节点
 *
 * @author jhb
 * @date 2020/12/04
 */
public class Demo1 {

    /**
     * 一棵二叉树共有几个节点
     *
     * @param treeNode
     * @return 个数
     */
    private static int getTreeNodeCounts(TreeNode treeNode) {
        if (treeNode == null) return 0;
        return 1 + getTreeNodeCounts(treeNode.left) + getTreeNodeCounts(treeNode.right);
    }

}
