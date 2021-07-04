package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;


/**
 * <h1>Linked List Cycle</h1>
 *
 * <p>Given head, the head of a linked list, determine if the linked list has a cycle in it.</p>
 *
 * <p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.</p>
 *
 * <p>Return true if there is a cycle in the linked list. Otherwise, return false.</p>
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (isNoCycle(head)) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (!isNoCycle(fast)) {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    private boolean isNoCycle(ListNode node) {
        return node == null || node.next == null || node.next.next == null;
    }
}
