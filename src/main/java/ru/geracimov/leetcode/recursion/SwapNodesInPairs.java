package ru.geracimov.leetcode.recursion;

import java.util.StringJoiner;

/**
 * Swap Nodes in Pairs
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes
 * (i.e., only nodes themselves may be changed.)
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        var current = new ListNode(0, head);
        var res = current;
        ListNode first;
        ListNode second;
        while ((first = current.next) != null && (second = current.next.next) != null) {
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = current.next.next;
        }
        return res.next;
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

    @Override
    public String toString() {
        ListNode curr = this;
        var builder = new StringJoiner("->");
        while (curr != null) {
            builder.add("" + curr.val);
            curr = curr.next;
        }
        return builder.toString();
    }
}
