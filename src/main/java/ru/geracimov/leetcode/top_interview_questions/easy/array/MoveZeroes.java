package ru.geracimov.leetcode.top_interview_questions.easy.array;

/**
 * Move Zeroes
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int start = nextNonZero(nums, 0);
        int count = 0;
        while (start >= 0 && start < nums.length) {
            nums[count++] = nums[start];
            start = nextNonZero(nums, start + 1);
        }
        for (int i = 1; i < nums.length - count + 1; i++) {
            nums[nums.length - i] = 0;
        }
    }

    private int nextNonZero(int[] nums, int start) {
        while (start < nums.length) {
            if (nums[start] != 0) {
                return start;
            }
            start++;
        }
        return -1;
    }
}
