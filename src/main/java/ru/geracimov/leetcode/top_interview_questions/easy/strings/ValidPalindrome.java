package ru.geracimov.leetcode.top_interview_questions.easy.strings;

/**
 * Valid Palindrome
 * <p>
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Constraints:
 * <ul>
 *     <li>1 <= s.length <= 2 * 10^5</li>
 *     <li>s consists only of printable ASCII characters.</li>
 * </ul>
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleared = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (cleared.length() == 0) return true;
        char[] chars = cleared.toCharArray();
        int maxIndex = chars.length - 1;
        for (int i = 0; i <= maxIndex / 2; i++) {
            if (chars[i] != chars[maxIndex - i]) {
                return false;
            }
        }
        return true;
    }
}
