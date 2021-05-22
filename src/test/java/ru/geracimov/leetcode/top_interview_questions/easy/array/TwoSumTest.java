package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).containsExactly(0, 1);
        assertThat(twoSum.twoSum(new int[]{3, 2, 4}, 6)).containsExactly(1, 2);
    }
}