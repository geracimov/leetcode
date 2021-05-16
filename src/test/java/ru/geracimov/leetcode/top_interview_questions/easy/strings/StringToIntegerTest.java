package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerTest {
    private final StringToInteger parser = new StringToInteger();

    @Test
    void myAtoi() {
        assertThat(parser.myAtoi("4193 with words")).isEqualTo(4193);
        assertThat(parser.myAtoi("words and 987")).isZero();
        assertThat(parser.myAtoi("-91283472332")).isEqualTo(Integer.MIN_VALUE);
        assertThat(parser.myAtoi("1091283472332")).isEqualTo(Integer.MAX_VALUE);
        assertThat(parser.myAtoi("3.14159")).isEqualTo(3);
        assertThat(parser.myAtoi("  -0012a42")).isEqualTo(-12);
        assertThat(parser.myAtoi("42")).isEqualTo(42);
        assertThat(parser.myAtoi("      -42")).isEqualTo(-42);
        assertThat(parser.myAtoi("+-12")).isZero();
        assertThat(parser.myAtoi("+1")).isOne();
        assertThat(parser.myAtoi("20000000000000000000")).isEqualTo(Integer.MAX_VALUE);
        assertThat(parser.myAtoi("  0000000000012345678")).isEqualTo(12345678);
        assertThat(parser.myAtoi("00000-42a1234")).isZero();
        assertThat(parser.myAtoi(" ")).isZero();
    }
}