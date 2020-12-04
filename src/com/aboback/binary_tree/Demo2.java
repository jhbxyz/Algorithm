package com.aboback.binary_tree;

/**
 * 翻转二叉树
 *
 * @author jhb
 * @date 2020/12/24
 */
public class Demo2 {

    /**
     * 翻转二叉树
     *
     * @param root
     * @return 个数
     */
    private static TreeNode invertTreeNode(TreeNode root) {

        if (root == null) return null;

        //前序遍历
        // root 节点需要交换它的左右子节点
        final TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        // 让左右子节点继续翻转它们的子节点
        invertTreeNode(tempNode.left);

        invertTreeNode(tempNode.right);

        return root;

    }

}
