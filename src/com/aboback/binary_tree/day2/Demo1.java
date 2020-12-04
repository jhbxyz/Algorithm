package com.aboback.binary_tree.day2;

import com.aboback.binary_tree.TreeNode;

/**
 * 构造最大二叉树
 * 力扣第 654 题
 *
 * @author jhb
 * @date 2020/12/04
 */
public class Demo1 {

    int[] nums = {3, 2, 1, 6, 0, 5};

    private void constructMaximumBinaryTree(int[] nums) {
        build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int lo, int hi) {

        if (lo > hi) {
            return null;
        }

        // 找到数组中的最大值和对应的索引
        int index = -1, maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < this.nums.length; i++) {

            int num = nums[i];
            if (num > maxValue) {
                maxValue = num;
                index = i;
            }
        }

        final TreeNode root = new TreeNode(maxValue);

        // 递归调用构造左右子树
        root.left = build(nums, lo, index - 1);
        root.right = build(nums, index + 1, hi);

        return root;

    }

}
