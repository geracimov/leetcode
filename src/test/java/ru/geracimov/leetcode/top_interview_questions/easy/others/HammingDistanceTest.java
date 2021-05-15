package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Hamming Distance
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, return the Hamming distance between them.
 */
class HammingDistanceTest {
    private final HammingDistance hammingDistance = new HammingDistance();

    @Test
    void hammingDistance() {
        assertThat(hammingDistance.hammingDistance(1, 4)).isEqualTo(2);
        assertThat(hammingDistance.hammingDistance(3, 1)).isEqualTo(1);
    }
}