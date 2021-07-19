package ru.geracimov.leetcode.arrays101;

/**
 * <H1>Valid Mountain Array</H1>
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        var i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1])
            i++;

        if (i == 0 || i == n - 1)
            return false;

        while (i + 1 < n && arr[i] > arr[i + 1])
            i++;

        return i == n - 1;
    }
}
