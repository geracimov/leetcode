package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    void rotate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
        assertThat(nums).containsExactly(5, 6, 7, 1, 2, 3, 4);
    }

    @Test
    void rotate2() {
        int[] nums = {-1, -100, 3, 99};
        rotateArray.rotate(nums, 2);
        assertThat(nums).containsExactly(3, 99, -1, -100);
    }

    @Test
    void rotate3() {
        int[] nums = {1, 2};
        rotateArray.rotate(nums, 3);
        assertThat(nums).containsExactly(2, 1);
    }

    @Test
    void rotate4() {
        int[] nums = {1, 2};
        rotateArray.rotate(nums, 2);
        assertThat(nums).containsExactly(1, 2);
    }
}