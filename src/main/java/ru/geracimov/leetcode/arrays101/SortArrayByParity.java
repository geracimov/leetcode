package ru.geracimov.leetcode.arrays101;

/**
 * <h1>Sort Array By Parity</h1>
 * <p>
 * Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.
 * <p>
 * You may return any answer array that satisfies this condition.
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int lastOdd = -1;
        for (var i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) != 1 && ++lastOdd != i) {
                nums[lastOdd] += nums[i];
                nums[i] = nums[lastOdd] - nums[i];
                nums[lastOdd] = nums[lastOdd] - nums[i];
            }
        }
        return nums;
    }

}
