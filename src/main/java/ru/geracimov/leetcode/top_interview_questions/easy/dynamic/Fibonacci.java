package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

import java.math.BigInteger;

public class Fibonacci {
    public String fibonacci(int n) {
        if (n <= 2) {
            return String.valueOf(n);
        }
        BigInteger prev1 = BigInteger.ONE;
        BigInteger prev2 = BigInteger.ONE;
        BigInteger current;
        for (int i = 3; i <= n; i++) {
            current = prev1.add(prev2);
            prev1 = prev2;
            prev2 = current;
        }
        return prev2.toString();
    }
}
