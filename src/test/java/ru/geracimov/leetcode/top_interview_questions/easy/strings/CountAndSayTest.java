package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountAndSayTest {
    private final CountAndSay countAndSay = new CountAndSay();

    @Test
    void countAndSay() {
        assertThat(countAndSay.countAndSay(5)).isEqualTo("111221");
        assertThat(countAndSay.countAndSay(10)).isEqualTo("13211311123113112211");
    }

}