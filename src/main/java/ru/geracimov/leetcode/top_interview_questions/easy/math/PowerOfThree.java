package ru.geracimov.leetcode.top_interview_questions.easy.math;

/**
 * Power of Three
 * <p>
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n == 3^x.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        double log = log(3, n);
        return log - (int) log < 0.000000000001;
    }

    private double log(int a, int b) {
        return Math.log10(b) / Math.log10(a);
    }

    public boolean isPowerOfThree2(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
