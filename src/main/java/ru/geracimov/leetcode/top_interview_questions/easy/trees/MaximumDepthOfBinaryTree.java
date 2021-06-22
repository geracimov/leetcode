package ru.geracimov.leetcode.top_interview_questions.easy.trees;

/**
 * <h1>Maximum Depth of Binary Tree</h1>
 *
 * <p>Given the root of a binary tree, return its maximum depth.</p>
 *
 * <p>A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.</p>
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "[" + val + "]" +
                    (left == null ? "null" : String.valueOf(left.val))
                    + "-" +
                    (right == null ? "null" : String.valueOf(right.val));
        }
    }
}
