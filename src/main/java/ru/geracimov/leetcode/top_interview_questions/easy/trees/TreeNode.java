package ru.geracimov.leetcode.top_interview_questions.easy.trees;

public class TreeNode {
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
