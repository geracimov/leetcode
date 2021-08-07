package ru.geracimov.leetcode.arrays101;

/**
 * <h1>Third Maximum Number</h1>
 * <p>
 * Given integer array nums, return the third maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 * </p>
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long init = Long.MIN_VALUE;
        long[] max = new long[]{init, init, init};
        for (int num : nums) {
            if (num > max[2]) {
                shift(max, num);
            }
        }
        return (int) (max[2] != init ? max[2] : max[0]);
    }

    private void shift(long[] max, int num) {
        if (num > max[0]) {
            max[2] = max[1];
            max[1] = max[0];
            max[0] = num;
        } else if (num > max[1] && num != max[0]) {
            max[2] = max[1];
            max[1] = num;
        } else if (num > max[2] && num != max[0] && num != max[1]) {
            max[2] = num;
        }
    }
}
