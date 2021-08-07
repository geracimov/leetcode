package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThirdMaximumNumberTest {
    ThirdMaximumNumber solution = new ThirdMaximumNumber();

    @Test
    void thirdMax() {
        assertThat(solution.thirdMax(new int[]{2, 2, 3, 1})).isEqualTo(1);
        assertThat(solution.thirdMax(new int[]{3, 2, 1})).isEqualTo(1);
        assertThat(solution.thirdMax(new int[]{1, 2,})).isEqualTo(2);
        assertThat(solution.thirdMax(new int[]{1, 2, 2, 5, 3, 5})).isEqualTo(2);
    }
}