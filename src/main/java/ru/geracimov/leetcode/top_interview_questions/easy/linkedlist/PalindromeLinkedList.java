package ru.geracimov.leetcode.top_interview_questions.easy.linkedlist;

/**
 * <h1>Palindrome Linked List</h1>
 * <p>Given the head of a singly linked list, return true if it is a palindrome.</p>
 */
public class PalindromeLinkedList {
    ListNode ref;
    int i;
    int k;

    public boolean isPalindrome(ListNode head) {
        if (ref == null) {
            ref = head;
        }
        if (head == null) return true;
        k = ++i;
        boolean nextIsPalindrome = isPalindrome(head.next);
        if (k-- <= i / 2) return nextIsPalindrome;
        boolean isEqual = ref.val == head.val;
        ref = ref.next;
        return nextIsPalindrome && isEqual;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(this.val);
        }
    }
}
