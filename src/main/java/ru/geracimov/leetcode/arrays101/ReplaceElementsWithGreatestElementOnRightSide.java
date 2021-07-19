package ru.geracimov.leetcode.arrays101;

/**
 * <h1>Replace Elements with Greatest Element on Right Side</h1>
 * <p>
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        var i = 0;
        while (i < arr.length) {
            int[] max = getMax(arr, i + 1);
            while (max[0] > i) {
                arr[i++] = max[1];
            }
        }
        return arr;
    }

    private int[] getMax(int[] arr, int from) {
        if (from >= arr.length) return new int[]{from, -1};
        int iMax = from;
        int vMax = arr[from];
        for (int i = from; i < arr.length; i++) {
            if (vMax < arr[i]) {
                vMax = arr[i];
                iMax = i;
            }
        }
        return new int[]{iMax, vMax};
    }
}
