package ru.geracimov.leetcode.top_interview_questions.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (cache.containsKey(second)) {
                return new int[]{cache.get(second), i};
            }
            cache.put(nums[i], i);
        }
        return null;
    }
}
