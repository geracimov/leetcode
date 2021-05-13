package ru.geracimov.leetcode.top_interview_questions.easy.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountPrimesTest {
    private final CountPrimes countPrimes = new CountPrimes();

    @Test
    void countPrimes() {
        assertThat(countPrimes.countPrimes(10)).isEqualTo(4);
        assertThat(countPrimes.countPrimes(40)).isEqualTo(12);
        assertThat(countPrimes.countPrimes(0)).isZero();
        assertThat(countPrimes.countPrimes(1)).isZero();
    }
    @Test
    void countPrimes2() {

        assertThat(countPrimes.countPrimes(999983)).isEqualTo(78497);

    }
    @Test
    void countPrimes3() {
        assertThat(countPrimes.countPrimes(500000)).isEqualTo(41538);

    }
    @Test
    void countPrimes33() {
        assertThat(countPrimes.countPrimes(Integer.MAX_VALUE)).isEqualTo(41538);

    }

}