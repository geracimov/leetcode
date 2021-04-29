package ru.geracimov.leetcode.top_interview_questions.easy.strings;

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
