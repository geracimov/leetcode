package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {
    private LinkedListCycle linkedListCycle;

    @BeforeEach
    void setUp() {
        linkedListCycle = new LinkedListCycle();
    }

    @Test
    void hasCycle4() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertThat(linkedListCycle.hasCycle(head)).isTrue();
    }

    @Test
    void hasCycle2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertThat(linkedListCycle.hasCycle(head)).isTrue();
    }

    @Test
    void hasCycle1() {
        ListNode head = new ListNode(1);
        assertThat(linkedListCycle.hasCycle(head)).isFalse();
    }

}