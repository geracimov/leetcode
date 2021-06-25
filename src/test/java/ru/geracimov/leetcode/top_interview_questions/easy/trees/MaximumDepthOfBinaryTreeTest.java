package ru.geracimov.leetcode.top_interview_questions.easy.trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {
    MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;
    TreeNode node15, node7, node20, node9, node3;

    @Test
    void maxDepth() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        node15 = new TreeNode(15);
        node7 = new TreeNode(7);
        node20 = new TreeNode(20, node15, node7);
        node9 = new TreeNode(9);
        node3 = new TreeNode(3, node9, node20);
        assertThat(maximumDepthOfBinaryTree.maxDepth(node3)).isEqualTo(3);
    }

    @Test
    void maxDepth2() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        node15 = new TreeNode(15);
        node20 = new TreeNode(20, null, node15);
        assertThat(maximumDepthOfBinaryTree.maxDepth(node20)).isEqualTo(2);
    }

}