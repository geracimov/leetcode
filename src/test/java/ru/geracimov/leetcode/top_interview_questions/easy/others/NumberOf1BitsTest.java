package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOf1BitsTest {
    private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @RepeatedTest(100)
    void hammingWeight() {
        assertThat(numberOf1Bits.hammingWeight(11)).isEqualTo(3);
    }

    @RepeatedTest(10)
    void hammingWeight2() {
        assertThat(numberOf1Bits.hammingWeight2(11)).isEqualTo(3);
        assertThat(numberOf1Bits.hammingWeight2(Integer.MIN_VALUE)).isEqualTo(1);
        assertThat(numberOf1Bits.hammingWeight2(Integer.MAX_VALUE)).isEqualTo(31);
    }

}