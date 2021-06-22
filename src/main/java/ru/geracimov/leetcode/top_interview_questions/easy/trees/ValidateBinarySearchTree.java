package ru.geracimov.leetcode.top_interview_questions.easy.trees;

/**
 * <h1>Validate Binary Search Tree</h1>
 *
 * <p>Given the root of a binary tree, determine if it is a valid binary search tree (BST).</p>
 *
 * <p>A valid BST is defined as follows:</p>
 * <ul>
 *     <li>The left subtree of a node contains only nodes with keys less than the node's key.</li>
 *     <li>The right subtree of a node contains only nodes with keys greater than the node's key.</li>
 *     <li>Both the left and right subtrees must also be binary search trees.</li>
 *     </ul>
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= min) return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, maxVal);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
