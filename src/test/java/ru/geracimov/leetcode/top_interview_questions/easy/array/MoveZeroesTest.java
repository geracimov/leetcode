package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MoveZeroesTest {
    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    void moveZeroes2() {
        int[] nums = {0};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(0);
    }

    @Test
    void moveZeroes3() {
        int[] nums = {1, 0, 1};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 1, 0);
    }

    @Test
    void moveZeroes4() {
        int[] nums = { 0, 1};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1,0);
    }
}