package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Count and Say
 * <p>
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * <ul>
 *     <li>countAndSay(1) = "1"</li>
 *     <li>countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.</li>
 * </ul>
 * <p>
 * To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.
 * </p>
 * For example, the saying and conversion for digit string "3322251": Given a positive integer n, return the nth term of the count-and-say sequence.
 */
public class CountAndSay {
    private static final Map<Integer, String> cache = new ConcurrentHashMap<>();

    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        else
            return cache.computeIfAbsent(n, p -> say(countAndSay(p - 1)));
    }

    private String say(String s) {
        if (s.isEmpty()) return s;
        var sb = new StringBuilder();
        var last = s.charAt(0);
        var count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == last) {
                count++;
            } else {
                sb.append(count).append(last);
                count = 1;
                last = ch;
            }
        }
        sb.append(count).append(last);
        return sb.toString();
    }
}
