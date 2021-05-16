package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissingNumberTest {
    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    void missingNumber() {
        assertThat(missingNumber.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
        assertThat(missingNumber.missingNumber(new int[]{0, 1})).isEqualTo(2);
        assertThat(missingNumber.missingNumber(new int[]{0})).isEqualTo(1);
        assertThat(missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }
}