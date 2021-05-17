package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {
    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    void singleNumber() {
        assertThat(singleNumber.singleNumber(new int[]{2, 2, 1})).isOne();
        assertThat(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
        assertThat(singleNumber.singleNumber(new int[]{1})).isOne();
        assertThat(singleNumber.singleNumber(new int[]{-336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, 354})).isEqualTo(354);
    }
}