package ru.geracimov.leetcode.Arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesTest {
    private final MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

    @Test
    void findMaxConsecutiveOnes() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})).isEqualTo(3);
    }
    @Test
    void findMaxConsecutiveOnes2() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})).isEqualTo(2);
    }
}