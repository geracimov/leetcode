package ru.geracimov.leetcode.top_interview_questions.easy.math;

/**
 * Count Primes
 * <p>
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3)
            return 0;

        var f = new boolean[n];
        int count = n / 2;
        for (var i = 3; i * i < n; i += 2) {
            if (f[i])
                continue;

            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;

    }
}
