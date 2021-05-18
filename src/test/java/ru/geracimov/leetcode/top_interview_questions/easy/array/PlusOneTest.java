package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {
    private final PlusOne plusOne = new PlusOne();

    @Test
    void plusOne() {
        int[] digits = {1, 2, 3};
        assertThat(plusOne.plusOne(digits)).containsExactly(1, 2, 4);
    }
    @Test
    void plusOne2() {
        int[] digits = {4,3,2,1};
        assertThat(plusOne.plusOne(digits)).containsExactly(4,3,2,2);
    }
    @Test
    void plusOne3() {
        int[] digits = {4,9,9,9};
        assertThat(plusOne.plusOne(digits)).containsExactly(5,0,0,0);
    }
    @Test
    void plusOne4() {
        int[] digits = {9,9,9};
        assertThat(plusOne.plusOne(digits)).containsExactly(1,0,0,0);
    }
}