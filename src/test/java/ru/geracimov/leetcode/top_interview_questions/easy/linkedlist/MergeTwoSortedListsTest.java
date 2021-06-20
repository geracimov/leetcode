package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists sorter = new MergeTwoSortedLists();
    private MergeTwoSortedLists.ListNode node11, node12, node13;
    private MergeTwoSortedLists.ListNode node21, node22, node23;

    @BeforeEach
    void setUp() {
        node11 = new MergeTwoSortedLists.ListNode(1);
        node12 = new MergeTwoSortedLists.ListNode(2);
        node13 = new MergeTwoSortedLists.ListNode(3);
        node11.next = node12;
        node12.next = node13;
        node21 = new MergeTwoSortedLists.ListNode(1);
        node22 = new MergeTwoSortedLists.ListNode(2);
        node23 = new MergeTwoSortedLists.ListNode(3);
        node21.next = node22;
        node22.next = node23;
    }

    @Test
    void mergeTwoLists3() {
        MergeTwoSortedLists.ListNode listNode = sorter.mergeTwoLists(node11, node21);
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
        MergeTwoSortedLists.ListNode listNode = sorter.mergeTwoLists(node13, node23);
        assertThat(listNode.val).isEqualTo(3);
        assertThat(listNode.next.val).isEqualTo(3);
        assertThat(listNode.next.next).isNull();
    }

    @Test
    void mergeTwoLists0() {
        MergeTwoSortedLists.ListNode listNode = sorter.mergeTwoLists(null, node23);
        assertThat(listNode.val).isEqualTo(3);
        assertThat(listNode.next).isNull();
    }

    @Test
    void mergeTwoListsNull() {
        MergeTwoSortedLists.ListNode listNode = sorter.mergeTwoLists(null, null);
        assertThat(listNode).isNull();
    }
}