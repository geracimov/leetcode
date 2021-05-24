package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {
    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void climbStairs2() {
        assertThat(climbingStairs.climbStairs(2)).isEqualTo(2);
    }

    @Test
    void climbStairs3() {
        assertThat(climbingStairs.climbStairs(3)).isEqualTo(3);
    }

    @Test
    void climbStairs43() {
        assertThat(climbingStairs.climbStairs(43)).isEqualTo(701408733);
    }

    @Test
    void climbStairs45() {
        assertThat(climbingStairs.climbStairs(45)).isEqualTo(1836311903);
    }
}