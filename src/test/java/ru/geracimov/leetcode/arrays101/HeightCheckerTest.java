package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HeightCheckerTest {
    private final HeightChecker test = new HeightChecker();

    @Test
    void heightChecker() {
        assertThat(test.heightChecker(new int[]{5, 2, 3})).isEqualTo(3);
        assertThat(test.heightChecker(new int[]{1, 2, 3})).isZero();
        assertThat(test.heightChecker(new int[]{1, 1, 4, 2, 1, 3})).isEqualTo(3);
        assertThat(test.heightChecker(new int[]{5, 1, 2, 3, 4})).isEqualTo(5);
        assertThat(test.heightChecker(new int[]{1, 2, 3, 4, 5})).isZero();
    }
}