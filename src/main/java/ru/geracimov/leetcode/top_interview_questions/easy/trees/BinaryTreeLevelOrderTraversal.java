package ru.geracimov.leetcode.top_interview_questions.easy.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Binary Tree Level Order Traversal</h1>
 * <p>
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {

    List<List<Integer>> result = new ArrayList<>();
    int level;

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = addOnLevel2(root);
        lists.removeIf(List::isEmpty);
        return lists;
    }

    private List<List<Integer>> addOnLevel2(TreeNode root) {
        if (root != null) {
            if (level <= result.size()) {
                result.add(new ArrayList<>());
            }
            List<Integer> onLevel = result.get(level);
            onLevel.add(root.val);
            ++level;
            if (root.left != null)
                levelOrder(root.left);
            if (root.right != null)
                levelOrder(root.right);
            --level;
        }
        return result;
    }

}
