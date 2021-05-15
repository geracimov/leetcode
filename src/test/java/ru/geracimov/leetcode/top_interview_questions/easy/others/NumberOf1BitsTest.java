package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOf1BitsTest {
    private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @RepeatedTest(100)
    void hammingWeight() {
        assertThat(numberOf1Bits.hammingWeight(11)).isEqualTo(3);
    }

}