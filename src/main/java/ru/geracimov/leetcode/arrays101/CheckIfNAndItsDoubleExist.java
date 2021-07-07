package ru.geracimov.leetcode.arrays101;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Check If N and Its Double Exist</h1>
 * <p>
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that :
 * <ul>
 * <li>i != j</li>
 * <li>0 <= i, j < arr.length</li>
 * <li>arr[i] == 2 * arr[j]</li>
 * </ul>
 */
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i << 1);
            if ((i & 1) == 0) set.add(i >> 1);
        }
        return false;
    }
}
