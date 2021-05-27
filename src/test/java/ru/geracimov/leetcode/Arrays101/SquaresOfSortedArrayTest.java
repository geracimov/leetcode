package ru.geracimov.leetcode.Arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfSortedArrayTest {
    private final SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();

    @Test
    void sortedSquares() {
        assertThat(squaresOfSortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10})).containsExactly(0, 1, 9, 16, 100);
    }

    @Test
    void sortedSquares2() {
        assertThat(squaresOfSortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11})).containsExactly(4, 9, 9, 49, 121);
    }
}