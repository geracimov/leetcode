package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode node5 = new ListNode(5);
    ListNode node4 = new ListNode(4, node5);
    ListNode node3 = new ListNode(3, node4);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);


    @Test
    void reverseList5() {
        System.out.println(node1);
        ListNode listNode = reverseLinkedList.reverseList(node1);
        System.out.println(listNode);
        assertThat(listNode).isEqualTo(node5);
        assertThat(listNode.next).isEqualTo(node4);
        assertThat(listNode.next.next).isEqualTo(node3);
        assertThat(listNode.next.next.next).isEqualTo(node2);
        assertThat(listNode.next.next.next.next).isEqualTo(node1);
        assertThat(listNode.next.next.next.next.next).isNull();
    }

    @Test
    void reverseList2() {
        ListNode listNode = reverseLinkedList.reverseList(node4);
        assertThat(listNode).isEqualTo(node5);
        assertThat(listNode.next).isEqualTo(node4);
        assertThat(listNode.next.next).isNull();
    }

    @Test
    void reverseList1() {
        ListNode listNode = reverseLinkedList.reverseList(node5);
        assertThat(listNode).isEqualTo(node5);
        assertThat(listNode.next).isNull();
    }
}