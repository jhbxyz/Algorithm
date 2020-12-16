package com.aboback.binary_tree.day5;

import com.aboback.binary_tree.TreeNode;

/**
 * 在 BST 中删除一个数
 *
 * @author jhb
 * @date 2020/12/16
 */
public class Demo4 {

    TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            // 找到啦，进行删除
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);


        } else if (root.val > key) {
            // 去左子树找
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    private TreeNode getMin(TreeNode node) {
        // BST 最左边的就是最小的
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

}
