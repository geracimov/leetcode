package ru.geracimov.leetcode.recursion;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RecurrenceRelation {
    private final Map<Point, Integer> cache = new HashMap<>();

    public int recurrenceRelation(int i, int j) {
        var key = new Point(i, j);
        return cache.computeIfAbsent(key, k -> pascalTriangle(k.x, k.y));
    }

    private int pascalTriangle(int i, int j) {
        if (i + j < 2) return 0;
        if (j == 1 || j == i) return 1;
        return pascalTriangle(i - 1, j - 1) + pascalTriangle(i - 1, j);
    }

}
