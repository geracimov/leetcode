package ru.geracimov.leetcode.top_interview_questions.easy.array;

import java.util.Arrays;

/**
 * Contains Duplicate
 * <p>Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.</p>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate2(int[] nums) {
        if (nums.length <= 1) return false;
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int preLast = nums.length - 1;
        var i = 0;
        while (i < preLast) {
            if (nums[i] == nums[++i]) return true;
        }
        return false;
    }
}
