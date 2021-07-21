package ru.geracimov.leetcode.arrays101;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length < 2) return 0;
        int[] i = new int[2];
        Arrays.stream(heights).sorted()
                .forEach(v -> {
                    if (v != heights[i[0]++]) i[1]++;
                });
        return i[1];
    }
}
