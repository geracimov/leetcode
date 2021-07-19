package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortArrayByParityTest {
    SortArrayByParity test = new SortArrayByParity();

    @Test
    void sortArrayByParity() {
        assertThat(test.sortArrayByParity(new int[]{3, 1, 2, 4})).containsExactly(2, 4, 3, 1);
        assertThat(test.sortArrayByParity(new int[]{0, 2})).containsExactly(0, 2);
    }
}