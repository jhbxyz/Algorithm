package com.aboback.binary_tree.day4;

import com.aboback.binary_tree.TreeNode;

/**
 * 力扣第 230 题
 * 「二叉搜索树中第K小的元素」
 *
 * @author jhb
 * @date 2020/12/15
 */
public class Demo1 {

    int res = 0;

    int rank = 0;

    int kthSmallest(TreeNode root, int k) {

        traverse(root, k);

        return res;
    }

    private void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        traverse(root.left, k);

        rank++;
        if (k == rank) {
            res = root.val;
            return;
        }

        traverse(root.right, k);

    }


}
