package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists sorter = new MergeTwoSortedLists();
    private ListNode node11, node12, node13;
    private ListNode node21, node22, node23;

    @BeforeEach
    void setUp() {
        node11 = new ListNode(1);
        node12 = new ListNode(2);
        node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;
        node21 = new ListNode(1);
        node22 = new ListNode(2);
        node23 = new ListNode(3);
        node21.next = node22;
        node22.next = node23;
    }

    @Test
    void mergeTwoLists3() {
        ListNode listNode = sorter.mergeTwoLists(node11, node21);
        assertThat(listNode.val).isEqualTo(1);
        assertThat(listNode.next.val).isEqualTo(1);
        assertThat(listNode.next.next.val).isEqualTo(2);
        assertThat(listNode.next.next.next.val).isEqualTo(2);
        assertThat(listNode.next.next.next.next.val).isEqualTo(3);
        assertThat(listNode.next.next.next.next.next.val).isEqualTo(3);
        assertThat(listNode.next.next.next.next.next.next).isNull();
    }

    @Test
    void mergeTwoLists1() {
        ListNode listNode = sorter.mergeTwoLists(node13, node23);
        assertThat(listNode.val).isEqualTo(3);
        assertThat(listNode.next.val).isEqualTo(3);
        assertThat(listNode.next.next).isNull();
    }

    @Test
    void mergeTwoLists0() {
        ListNode listNode = sorter.mergeTwoLists(null, node23);
        assertThat(listNode.val).isEqualTo(3);
        assertThat(listNode.next).isNull();
    }

    @Test
    void mergeTwoListsNull() {
        ListNode listNode = sorter.mergeTwoLists(null, null);
        assertThat(listNode).isNull();
    }
}