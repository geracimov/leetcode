package ru.geracimov.leetcode.top_interview_questions.easy.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfThreeTest {
    private final PowerOfThree powerOfThree = new PowerOfThree();

    @Test
    void isPowerOfThree() {
        assertThat(powerOfThree.isPowerOfThree(27)).isTrue();
        assertThat(powerOfThree.isPowerOfThree(0)).isFalse();
        assertThat(powerOfThree.isPowerOfThree(9)).isTrue();
        assertThat(powerOfThree.isPowerOfThree(45)).isFalse();
    }

}