package ru.geracimov.leetcode.arrays101;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Find All Numbers Disappeared in an Array</h1>
 * <p>
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers
 * in the range [1, n] that do not appear in nums.
 * </p>
 */
public class FindAllNumbersDisappearedArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i) - 1;
            if (nums[index] > 0) {
                nums[index] = Math.negateExact(nums[index]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
