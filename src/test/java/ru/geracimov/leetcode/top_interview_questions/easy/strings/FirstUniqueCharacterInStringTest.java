package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterInStringTest {
    private final FirstUniqueCharacterInString unique = new FirstUniqueCharacterInString();

    @Test
    void firstUniqChar() {
        assertThat(unique.firstUniqChar("leetcode")).isZero();
        assertThat(unique.firstUniqChar("loveleetcode")).isEqualTo(2);
        assertThat(unique.firstUniqChar("aabb")).isEqualTo(-1);
    }

}