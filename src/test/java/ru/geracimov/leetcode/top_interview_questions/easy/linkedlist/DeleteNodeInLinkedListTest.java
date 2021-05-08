package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.geracimov.leetcode.top_interview_questions.easy.linkedlist.DeleteNodeInLinkedList.ListNode;

class DeleteNodeInLinkedListTest {
    private final DeleteNodeInLinkedList remover = new DeleteNodeInLinkedList();
    private ListNode node1, node2, node3, node4;

    @BeforeEach
    void setUp() {
        node1 = new ListNode(1);
        node2 = new ListNode(2);
        node3 = new ListNode(3);
        node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }

    @Test
    void deleteNode3() {
        node1.print();
        remover.deleteNode(node3);
        assertThat(node1.next).isEqualTo(node2);
        assertThat(node2.next).isEqualTo(node4);
        node1.print();
    }

    @Test
    void deleteNode2() {
        node1.print();
        remover.deleteNode(node2);
        assertThat(node1.next).isEqualTo(node3);
        assertThat(node3.next).isEqualTo(node4);
        node1.print();
    }

    @Test
    void deleteNode1() {
        node1.print();
        remover.deleteNode(node1);
        assertThat(node1.next).isEqualTo(node3);
        assertThat(node3.next).isEqualTo(node4);
        node1.print();
    }

}