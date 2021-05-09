package ru.geracimov.leetcode.top_interview_questions.easy.array;

/**
 * Remove Duplicates from Sorted Array
 * <p>
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Clarification:
 * <p>
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 * Constraints:
 *<ul>
 *     <li>0 <= nums.length <= 3 * 10^4</li>
 *     <li>-10^4 <= nums[i] <= 10^4</li>
 *     <li>nums is sorted in ascending order.</li>
 *</ul>
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        var prev = Integer.MIN_VALUE;
        var index = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                nums[index++] = prev;
            }
        }
        return index;
    }

}
