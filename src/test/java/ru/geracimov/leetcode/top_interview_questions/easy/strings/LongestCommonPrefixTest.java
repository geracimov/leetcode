package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEmpty();
    }
}