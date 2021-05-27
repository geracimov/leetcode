package ru.geracimov.leetcode.Arrays101;

/**
 * Find Numbers with Even Number of Digits
 * <p>
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (digitCount(num) % 2 == 0)
                res++;
        }
        return res;
    }

    private int digitCount(int num) {
        int abs = Math.abs(num);
        int pow = 10;
        for (int i = 1; i < 9; i++) {
            if (abs < pow)
                return i;
            pow *= 10;
        }
        return 10;
    }
}
