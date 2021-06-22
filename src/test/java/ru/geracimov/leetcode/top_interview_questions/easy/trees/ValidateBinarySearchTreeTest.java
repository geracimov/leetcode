package ru.geracimov.leetcode.top_interview_questions.easy.trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateBinarySearchTreeTest {
    ValidateBinarySearchTree maximumDepthOfBinaryTree;
    ValidateBinarySearchTree.TreeNode node1, node3, node4, node6, node5;


    @Test
    void isValidBST() {
        maximumDepthOfBinaryTree = new ValidateBinarySearchTree();
        node3 = new ValidateBinarySearchTree.TreeNode(3);
        node6 = new ValidateBinarySearchTree.TreeNode(6);
        node4 = new ValidateBinarySearchTree.TreeNode(4, node3, node6);
        node1 = new ValidateBinarySearchTree.TreeNode(1);
        node5 = new ValidateBinarySearchTree.TreeNode(5, node1, node4);
        assertThat(maximumDepthOfBinaryTree.isValidBST(node5)).isFalse();
    }
    @Test
    void isValidBST222() {
        maximumDepthOfBinaryTree = new ValidateBinarySearchTree();
        node1 = new ValidateBinarySearchTree.TreeNode(2);
        node3 = new ValidateBinarySearchTree.TreeNode(2);
        node4 = new ValidateBinarySearchTree.TreeNode(2, node1, node3);
        assertThat(maximumDepthOfBinaryTree.isValidBST(node4)).isFalse();
    }
    @Test
    void isValidBST11() {
        maximumDepthOfBinaryTree = new ValidateBinarySearchTree();
        node1 = new ValidateBinarySearchTree.TreeNode(1);
        node4 = new ValidateBinarySearchTree.TreeNode(1, node1, null);
        assertThat(maximumDepthOfBinaryTree.isValidBST(node4)).isFalse();
    }

}