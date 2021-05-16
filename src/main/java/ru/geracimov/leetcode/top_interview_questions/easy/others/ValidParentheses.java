package ru.geracimov.leetcode.top_interview_questions.easy.others;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stack.push(c);
            } else if (isClose(c) && (stack.isEmpty() || !isPair(stack.pop(), c))) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isClose(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private boolean isPair(char c1, char c2) {
        return c1 == '[' && c2 == ']'
                || c1 == '(' && c2 == ')'
                || c1 == '{' && c2 == '}';
    }
}
