package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import java.util.regex.Pattern;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p/>
 * The algorithm for myAtoi(string s) is as follows:
 * <p/>
 * <ol>
 * <li>Read in and ignore any leading whitespace.</li>
 * <li>Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.</li>
 * <li>Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.</li>
 * <li>Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).</li>
 * <li>If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -2^31 should be clamped to -2^31, and integers greater than 2^31 - 1 should be clamped to 2^31 - 1.</li>
 * Return the integer as the final result.
 * </ol>
 * Note:
 * <ul>
 *     <li>Only the space character ' ' is considered a whitespace character.</li>
 *     <li>Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.</li>
 * </ul>
 */
public class StringToInteger {
    private static final Pattern PATTERN = Pattern.compile("^[\\s]*\\D*([-+]?\\d{1,11}).*$");

    public int myAtoi2(String s) {
        var matcher = PATTERN.matcher(s);
        if (matcher.find()) {
            var l = Long.parseLong(matcher.group(1).replace("+", ""));
            if (l > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (l < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) l;
            }
        }
        return 0;
    }

    int myAtoi(String s) {
        if (s == null || s.isBlank()) return 0;
        char[] str = s.toCharArray();
        var sign = 1;
        var base = 0;
        var i = 0;
        while (str[i] == ' ') {
            i++;
        }
        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }
        while (i < str.length && str[i] >= '0' && str[i] <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str[i] - '0' > 7)) {
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }

}
