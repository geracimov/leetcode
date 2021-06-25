package ru.geracimov.leetcode.top_interview_questions.easy.trees;

/**
 * <h1>Symmetric Tree</h1>
 *
 * <p>Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).</p>
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null ^ right == null) || left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

}
