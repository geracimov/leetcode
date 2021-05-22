package ru.geracimov.leetcode.top_interview_questions.easy.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Intersection of Two Arrays II
 * <p>Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return
 * the result in any order.</p>
 */
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] shortArr, longArr;
        ArrayList<Integer> res = new ArrayList<>();

        shortArr = nums1.length < nums2.length ? nums1 : nums2;
        longArr = shortArr == nums1 ? nums2 : nums1;
        outer:
        for (int i = 0, j = 0; i < shortArr.length && j < longArr.length; i++) {
            while (longArr[j] < shortArr[i]) {
                if (j >= longArr.length - 1) {
                    break outer;
                }
                j++;
            }
            if (shortArr[i] == longArr[j]) {
                res.add(shortArr[i]);
                j++;
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
