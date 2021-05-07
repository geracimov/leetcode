package ru.geracimov.leetcode.top_interview_questions.easy.strings;

/**
 * Reverse String
 * <p>Write a function that reverses a string. The input string is given as an array of characters s.</p>
 * Constraints:
 *<ul>
 *     <li>1 <= s.length <= 10^5</li>
 *     <li>s[i] is a printable ascii character.</li>
 *     </ul>
 */
public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        for (var i = 0; i < s.length / 2; i++) {
            int r = s.length - i - 1;
            if (s[i] != s[r]) {
                temp = s[i];
                s[i] = s[r];
                s[r] = temp;
            }
        }
    }
}
