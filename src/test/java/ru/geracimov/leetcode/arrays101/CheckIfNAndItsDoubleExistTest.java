package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckIfNAndItsDoubleExistTest {
    private CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();

    @Test
    void checkIfExist() {
        assertThat(checkIfNAndItsDoubleExist.checkIfExist(new int[]{10, 2, 5, 3})).isTrue();
        assertThat(checkIfNAndItsDoubleExist.checkIfExist(new int[]{7, 1, 14, 11})).isTrue();
        assertThat(checkIfNAndItsDoubleExist.checkIfExist(new int[]{3, 1, 7, 11})).isFalse();
    }
}