package ru.geracimov.leetcode.top_interview_questions.easy.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToInt() {
        assertThat(romanToInteger.romanToInt("III")).isEqualTo(3);
        assertThat(romanToInteger.romanToInt("IV")).isEqualTo(4);
        assertThat(romanToInteger.romanToInt("LVIII")).isEqualTo(58);
        assertThat(romanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}