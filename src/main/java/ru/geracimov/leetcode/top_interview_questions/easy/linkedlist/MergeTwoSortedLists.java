package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

/**
 * <h1>Merge Two Sorted Lists</h1>
 * <p>Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.</p>
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        var dummy = new ListNode();
        var next = dummy;

        ListNode min = min(l1, l2);
        while (min != null) {
            next.next = min;
            next = next.next;
            if (min == l1) {
                l1 = l1.next;
            } else
                l2 = l2.next;
            min = min(l1, l2);
        }
        return dummy.next;
    }

    private ListNode min(ListNode l1, ListNode l2) {
        return l1 == null ? l2 :
                l2 == null ? l1 :
                        l1.val < l2.val ? l1 : l2;
    }

}
