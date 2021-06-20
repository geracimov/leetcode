package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveNthNodeFromEndOfListTest {
    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
    private RemoveNthNodeFromEndOfList.ListNode node1, node2, node3, node4, node5;

    @BeforeEach
    void setUp() {
        node1 = new RemoveNthNodeFromEndOfList.ListNode(1);
        node2 = new RemoveNthNodeFromEndOfList.ListNode(2);
        node3 = new RemoveNthNodeFromEndOfList.ListNode(3);
        node4 = new RemoveNthNodeFromEndOfList.ListNode(4);
        node5 = new RemoveNthNodeFromEndOfList.ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }

    @Test
    void removeNthFromEnd() {
        node1.print();
        RemoveNthNodeFromEndOfList.ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(node1, 2);
        listNode.print();
    }

    @Test
    void removeNthFromEnd1() {
        node5.print();
        RemoveNthNodeFromEndOfList.ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(node5, 1);
        assertThat(listNode).isNull();
    }

    @Test
    void removeNthFromEnd2() {
        node4.print();
        RemoveNthNodeFromEndOfList.ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(node4, 2);
        listNode.print();
    }

    @Test
    void removeNthFromEnd2_() {
        node4.print();
        RemoveNthNodeFromEndOfList.ListNode listNode = removeNthNodeFromEndOfList.removeNthFromEnd(node4, 1);
        listNode.print();
    }
}