package com.aboback.binary_tree.day5;

import com.aboback.binary_tree.TreeNode;

/**
 * 在 BST 中插入一个数
 *
 * @author jhb
 * @date 2020/12/16
 */
public class Demo3 {

    TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }
}
