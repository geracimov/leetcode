package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindAllNumbersDisappearedArrayTest {
    private FindAllNumbersDisappearedArray solution = new FindAllNumbersDisappearedArray();

    @Test
    void findDisappearedNumbers() {
        assertThat(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}))
                .containsExactly(5, 6);
        assertThat(solution.findDisappearedNumbers(new int[]{1, 1}))
                .containsExactly(2);
    }
}