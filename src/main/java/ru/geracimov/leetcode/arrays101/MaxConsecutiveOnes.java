package ru.geracimov.leetcode.arrays101;

/**
 * Max Consecutive Ones
 * <p>
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, curr = 0;
        for (int num : nums) {
            if (num > 0) curr++;
            else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        return Math.max(max, curr);
    }
}
