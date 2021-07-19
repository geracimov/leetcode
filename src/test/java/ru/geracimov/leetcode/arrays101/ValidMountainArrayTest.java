package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidMountainArrayTest {
    ValidMountainArray validMountainArray = new ValidMountainArray();

    @Test
    void validMountainArray() {
        assertThat(validMountainArray.validMountainArray(new int[]{0, 3, 2, 1})).isTrue();
        assertThat(validMountainArray.validMountainArray(new int[]{3, 5, 5})).isFalse();
    }
}