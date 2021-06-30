package ru.geracimov.leetcode.top_interview_questions.easy.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversalTest {
    private BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal;
    private TreeNode root, node11, node12, node121, node122;

    @BeforeEach
    void setUp() {
        binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        node122 = new TreeNode(7);
        node121 = new TreeNode(15);
        node12 = new TreeNode(20, node121, node122);
        node11 = new TreeNode(9);
        root = new TreeNode(3, node11, node12);
    }

    @Test
    void levelOrder() {
        assertThat(binaryTreeLevelOrderTraversal.levelOrder(root)).hasSize(3);
    }

}