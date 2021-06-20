package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import java.util.StringJoiner;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode first = prev;
        ListNode second = prev;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return prev.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }

        void print() {
            StringJoiner joiner = new StringJoiner("->");
            ListNode node = this;
            do {
                joiner.add("" + node.val);
            } while ((node = node.next) != null);
            System.out.println(joiner);
        }
    }
}
