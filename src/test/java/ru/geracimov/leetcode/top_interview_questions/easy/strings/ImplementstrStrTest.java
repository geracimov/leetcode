package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementstrStrTest {
    private final ImplementstrStr implementstrStr = new ImplementstrStr();

    @Test
    void strStr() {
        assertThat(implementstrStr.strStr("hello", "ll")).isEqualTo(2);
        assertThat(implementstrStr.strStr("aaaaa", "bba")).isEqualTo(-1);
        assertThat(implementstrStr.strStr("", "")).isZero();
    }
}