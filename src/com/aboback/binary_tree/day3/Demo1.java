package com.aboback.binary_tree.day3;

import com.aboback.binary_tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 力扣第 652 题「寻找重复子树」
 *
 * @author jhb
 * @date 2020/12/11
 */
public class Demo1 {


    // 记录所有子树以及出现的次数
    HashMap<String, Integer> memo = new HashMap<>();

    // 记录重复的子树根节点
    LinkedList<TreeNode> res = new LinkedList<>();

    List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        traverse(root);

        return res;
    }

    private String traverse(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String left = traverse(root.left);
        String right = traverse(root.right);

        String subTree = left + "," + right + "," + root.val;

        int freq = memo.getOrDefault(subTree, 0);
        // 多次重复也只会被加入结果集一次
        if (freq == 1) {
            res.add(root);
        }

        // 给子树对应的出现次数加一
        memo.put(subTree, freq + 1);

        return subTree;
    }

}
