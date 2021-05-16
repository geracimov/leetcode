package ru.geracimov.leetcode.top_interview_questions.easy.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>(numRows);
        for (var i = 0; i < numRows; i++) {
            ArrayList<Integer> listI = new ArrayList<>(i);
            lists.add(listI);
            listI.add(0, 1);
            for (var j = 1; j < i; j++) {
                List<Integer> prev = lists.get(i - 1);
                listI.add(prev.get(j) + prev.get(j - 1));
            }
            if (i > 0) listI.add(i, 1);
        }
        return lists;
    }

    public List<List<Integer>> generateArray(int numRows) {
        var arr = new Integer[numRows][];
        for (var i = 0; i < numRows; i++) {
            arr[i] = new Integer[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (var j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        return Arrays.stream(arr).map(List::of).collect(Collectors.toList());
    }
}
