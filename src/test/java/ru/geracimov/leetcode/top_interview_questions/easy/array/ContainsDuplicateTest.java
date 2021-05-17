package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {
    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void containsDuplicate() {
        assertThat(containsDuplicate.containsDuplicate(new int[]{3, 1})).isFalse();
        assertThat(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1})).isTrue();
        assertThat(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4})).isFalse();
        assertThat(containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isTrue();
    }
}