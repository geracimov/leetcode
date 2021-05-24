package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

/**
 * Climbing Stairs
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] vars = {1, 2};

        for (int i = 2; i < n; i++) {
            vars[i % 2] = vars[0] + vars[1];
        }
        return vars[(n - 1) % 2];
    }

    public int climbStairsRecursive(int n) {
        if (n < 3) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
