package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void isAnagram() {
        assertThat(validAnagram.isAnagram("a", "a")).isTrue();
        assertThat(validAnagram.isAnagram("aa", "a")).isFalse();
        assertThat(validAnagram.isAnagram("nl", "cx")).isFalse();
        assertThat(validAnagram.isAnagram("anagram", "nagaram")).isTrue();
        assertThat(validAnagram.isAnagram("rat", "car")).isFalse();
    }
}