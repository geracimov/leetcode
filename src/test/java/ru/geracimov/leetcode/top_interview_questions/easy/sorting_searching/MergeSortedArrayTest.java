package ru.geracimov.leetcode.top_interview_questions.easy.sorting_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    void merge2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        mergeSortedArray.merge(nums1, 1, nums2, 0);
        assertThat(nums1).containsExactly(1);
    }

    @Test
    void merge3() {
        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 3, 5, 6};
        mergeSortedArray.merge(nums1, 1, nums2, 5);
        assertThat(nums1).containsExactly(1, 2, 3, 4, 5, 6);
    }
}