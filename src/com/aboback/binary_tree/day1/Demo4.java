package com.aboback.binary_tree.day1;

import com.aboback.binary_tree.TreeNode;

/**
 * 将二叉树展开为链表
 *
 * @author jhb
 * @date 2020/12/04
 */
public class Demo4 {

    private void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        // 后序遍历位置
        // 1、左右子树已经被拉平成一条链表
        final TreeNode left = root.left;
        final TreeNode right = root.right;

        // 2、将左子树作为右子树
        root.left = null;
        root.right = left;

        // 3、将原先的右子树接到当前右子树的末端
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }

        p.right = right;

    }


}
