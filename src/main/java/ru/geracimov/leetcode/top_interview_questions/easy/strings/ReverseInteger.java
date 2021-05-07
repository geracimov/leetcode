package ru.geracimov.leetcode.top_interview_questions.easy.strings;

/**
 * Reverse Integer
 * <p>Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
 * the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</p>
 * Constraints:
 * <ul>
 *   <li>-2^31 <= x <= 2^31 - 1</li>
 * </ul>
 */
public class ReverseInteger {
    private static final int PRE_MAX_VALUE = Integer.MAX_VALUE / 10;
    private static final int PRE_MIN_VALUE = Integer.MIN_VALUE / 10;

    public int reverse(int x) {
        var result = 0;
        for (; x != 0; x /= 10) {
            int lastDigit = x % 10;
            if (result > PRE_MAX_VALUE || (result == PRE_MAX_VALUE && lastDigit > 7)) return 0;
            if (result < PRE_MIN_VALUE || (result == PRE_MIN_VALUE && lastDigit < -8)) return 0;
            result = result * 10 + lastDigit;
        }
        return result;
    }
}
