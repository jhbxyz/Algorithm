package com.aboback.binary_tree.day2;

import com.aboback.binary_tree.TreeNode;

/**
 * 力扣第 106 题
 * 通过后序和中序遍历结果构造二叉树
 *
 * @author jhb
 * @date 2020/12/10
 */
public class Demo3 {


    private TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1,
                postorder, 0, postorder.length - 1);
    }

    /**
     * 若前序遍历数组为 preorder[preStart..preEnd]，
     * 后续遍历数组为 postorder[postStart..postEnd]，
     * 构造二叉树，返回该二叉树的根节点
     */
    private TreeNode build(int[] inorder, int inStart, int inEnd,
                           int[] postorder, int postStart, int postEnd) {

        // root 节点对应的值就是后序遍历数组的最后一个元素
        int rootVal = postorder[postEnd];

        // rootVal 在中序遍历数组中的索引
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;

        // 先构造出当前根节点
        TreeNode root = new TreeNode(rootVal);

        // 递归构造左右子树
        root.left = build(inorder, inStart, index - 1,
                postorder, postStart, postStart + leftSize - 1);

        root.right = build(inorder, index + 1, inEnd,
                postorder, postStart + leftSize, postEnd);

        return root;
    }

}
