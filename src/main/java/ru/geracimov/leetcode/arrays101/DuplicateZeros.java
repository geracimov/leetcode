package ru.geracimov.leetcode.arrays101;

/**
 * <h1>Duplicate Zeros</h1>
 * <p>
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        var zeros = 0;
        var length = arr.length;
        for (int element : arr) {
            if (element == 0) zeros++;
        }
        var j = length + zeros - 1;
        var i = length - 1;
        do {
            if (j < length) arr[j] = arr[i];
            if (arr[i] == 0 && --j < length) arr[j] = arr[i];
        } while (i-- < j--);
    }

}
