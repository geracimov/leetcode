package ru.geracimov.leetcode.binary_search.template1;

/**
 * <h1>Find Peak Element</h1>
 * <p>
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1])
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
