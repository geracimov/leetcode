package ru.geracimov.leetcode.top_interview_questions.easy.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geracimov.leetcode.top_interview_questions.easy.trees.SymmetricTree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class SymmetricTreeTest {
    private TreeNode root, l2, r2, l3, r3, l4, r4;
    private SymmetricTree symmetricTree;

    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    void isSymmetric1() {
        l4 = new TreeNode(4);
        r4 = new TreeNode(4);
        l3 = new TreeNode(3);
        r3 = new TreeNode(3);
        l2 = new TreeNode(2, l3, l4);
        r2 = new TreeNode(2, r4, r3);
        root = new TreeNode(1, l2, r2);
        assertThat(symmetricTree.isSymmetric(root)).isTrue();
    }

    @Test
    void isSymmetric2() {
        l3 = new TreeNode(3);
        r3 = new TreeNode(3);
        l2 = new TreeNode(2, null, l3);
        r2 = new TreeNode(2, null, r3);
        root = new TreeNode(1, l2, r2);
        assertThat(symmetricTree.isSymmetric(root)).isFalse();
    }

    @Test
    void isSymmetric3() {
        l2 = new TreeNode(2);
        r3 = new TreeNode(3);
        root = new TreeNode(1, l2, r3);
        assertThat(symmetricTree.isSymmetric(root)).isFalse();
    }

}