package ru.geracimov.leetcode.recursion;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode current = new ListNode(0, head);
        ListNode first;
        ListNode second;
        while ((first = current.next) != null && (second = current.next.next) != null) {
            current.next = second;
            current.next.next = first;
        }
        ListNode.print(head);
        return current.next;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static void print(ListNode head) {
        while (head.next != null) {
            System.out.print(head);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.valueOf("(" + val + ")");
    }
}
