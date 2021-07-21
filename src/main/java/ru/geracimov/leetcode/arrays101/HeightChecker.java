package ru.geracimov.leetcode.arrays101;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length < 2) return 0;
//        var copy = new int[heights.length];
//        System.arraycopy(heights, 0, copy, 0, heights.length);
        int[] i = new int[1];
        int[] ints = Arrays.stream(heights).sorted().toArray();
        return (int) Arrays.stream(heights).sorted()
                .filter(v -> v != heights[i[0]++])
                .count();

    }
}
