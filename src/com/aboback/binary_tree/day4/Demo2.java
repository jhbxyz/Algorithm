package com.aboback.binary_tree.day4;

import com.aboback.binary_tree.TreeNode;

/**
 * 力扣第 538 题和 1038 题都是这道题
 * BST 转化累加树
 *
 * @author jhb
 * @date 2020/12/15
 */
public class Demo2 {


    TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.right);

        sum += root.val;

        root.val = sum;

        traverse(root.left);
    }


}
