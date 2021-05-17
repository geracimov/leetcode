package ru.geracimov.leetcode.top_interview_questions.easy.array;

import java.util.Arrays;

/**
 * Single Number
 * <p>Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.</p>
 * <p>You must implement a solution with a linear runtime complexity and use only constant extra space.</p>
 */
public class SingleNumber {

    public int singleNumber2(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        if (nums[0] != nums[1]) return nums[0];
        final int preLast = nums.length - 1;
        var i = -1;
        while (++i < preLast) {
            if (nums[i] != nums[++i]) return nums[i - 1];
        }
        return nums[preLast];
    }

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        var res = 0;
        for (int num : nums) {
            res ^= num;
        }

        return res;
    }

}
