package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void isPalindrome() {
        assertThat(validPalindrome.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
        assertThat(validPalindrome.isPalindrome("race a car")).isFalse();
        assertThat(validPalindrome.isPalindrome(" ")).isTrue();
        assertThat(validPalindrome.isPalindrome("ab_a")).isTrue();
    }
}