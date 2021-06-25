package ru.geracimov.leetcode.top_interview_questions.easy.trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateBinarySearchTreeTest {
    ValidateBinarySearchTree maximumDepthOfBinaryTree;
    TreeNode node1, node3, node4, node6, node5;

    @Test
    void isValidBST() {
        maximumDepthOfBinaryTree = new ValidateBinarySearchTree();
        node3 = new TreeNode(3);
        node6 = new TreeNode(6);
        node4 = new TreeNode(4, node3, node6);
        node1 = new TreeNode(1);
        node5 = new TreeNode(5, node1, node4);
        assertThat(maximumDepthOfBinaryTree.isValidBST(node5)).isFalse();
    }

    @Test
    void isValidBST222() {
        maximumDepthOfBinaryTree = new ValidateBinarySearchTree();
        node1 = new TreeNode(2);
        node3 = new TreeNode(2);
        node4 = new TreeNode(2, node1, node3);
        assertThat(maximumDepthOfBinaryTree.isValidBST(node4)).isFalse();
    }

    @Test
    void isValidBST11() {
        maximumDepthOfBinaryTree = new ValidateBinarySearchTree();
        node1 = new TreeNode(1);
        node4 = new TreeNode(1, node1, null);
        assertThat(maximumDepthOfBinaryTree.isValidBST(node4)).isFalse();
    }

}