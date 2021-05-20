package ru.geracimov.leetcode.top_interview_questions.easy.sorting_searching;

import java.util.Arrays;

/**
 * Merge Sorted Array
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * <p>The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.</p>
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1, i2 = n - 1, last = n + m - 1;
        while (last >= 0) {
            int n1 = i1 < 0 ? Integer.MIN_VALUE : nums1[i1];
            int n2 = i2 < 0 ? Integer.MIN_VALUE : nums2[i2];
            int max = Math.max(n1, n2);
            if (max == n1) i1--;
            else i2--;
            nums1[last--] = max;
        }
    }

    @SuppressWarnings("unused")
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
