package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseBitsTest {
    private final ReverseBits reverseBits = new ReverseBits();

    @Test
    void reverseBits() {
        assertThat(reverseBits.reverseBits(43261596)).isEqualTo(964176192);
        assertThat(reverseBits.reverseBits((int) 3221225471L)).isEqualTo((int) 4294967293L);
    }
}