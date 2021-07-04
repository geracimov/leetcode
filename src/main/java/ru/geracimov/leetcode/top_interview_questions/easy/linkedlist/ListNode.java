package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

import java.util.StringJoiner;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        var listNode = (ListNode) o;

        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return val;
    }

    void print() {
        var joiner = new StringJoiner("->");
        ListNode node = this;
        do {
            joiner.add("" + node.val);
        } while ((node = node.next) != null);
        System.out.println(joiner);
    }
}
