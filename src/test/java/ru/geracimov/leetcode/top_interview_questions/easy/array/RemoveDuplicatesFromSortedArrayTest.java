package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray duplicator = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates5() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertThat(duplicator.removeDuplicates(nums)).isEqualTo(5);
        assertThat(nums).containsSubsequence(0, 1, 2, 3, 4);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {1, 1, 2};
        assertThat(duplicator.removeDuplicates(nums)).isEqualTo(2);
        assertThat(nums).containsSubsequence(1, 2);
    }
}