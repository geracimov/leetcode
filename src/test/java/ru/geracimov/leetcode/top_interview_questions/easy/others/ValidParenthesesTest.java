package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid() {
        assertThat(validParentheses.isValid("{[]}")).isTrue();
        assertThat(validParentheses.isValid("{ { ( { } ) } }")).isTrue();
        assertThat(validParentheses.isValid("(]")).isFalse();
        assertThat(validParentheses.isValid("([)]")).isFalse();
    }
}