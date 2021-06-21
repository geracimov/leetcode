package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geracimov.leetcode.top_interview_questions.easy.linkedlist.PalindromeLinkedList.ListNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    ListNode node1, node2, node3, node4;
    PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    void setUp() {
        palindromeLinkedList = new PalindromeLinkedList();
        node4 = new ListNode(1);
        node3 = new ListNode(2, node4);
        node2 = new ListNode(2, node3);
        node1 = new ListNode(1, node2);
    }

    @Test
    void isPalindrome() {
        assertThat(palindromeLinkedList.isPalindrome(node1)).isTrue();
    }
    @Test
    void isPalindrome2() {
        assertThat(palindromeLinkedList.isPalindrome(node2)).isFalse();
    }
}