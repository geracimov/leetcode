package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    @ParameterizedTest
    @CsvSource(value = {"qwertyu|uytrewq", "a|a", "''|''"}, delimiter = '|')
    void reverseString(String original, String reversed) {
        char[] chars = original.toCharArray();
        reverseString.reverseString(chars);
        assertThat(chars).isEqualTo(reversed.toCharArray());
    }

}