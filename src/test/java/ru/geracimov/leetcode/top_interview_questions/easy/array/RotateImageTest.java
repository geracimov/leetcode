package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {
    private final RotateImage rotateImage = new RotateImage();

    @Test
    void rotate1x1() {
        int[][] matrix = new int[][]{{1}};
        rotateImage.rotate(matrix);

        int[][] rotated = new int[][]{{1}};
        assertThat(matrix).usingDefaultComparator().isEqualTo(rotated);
    }

    @Test
    void rotate2x2() {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}};
        rotateImage.rotate(matrix);

        int[][] rotated = new int[][]{
                {3, 1},
                {4, 2}};
        assertThat(matrix).usingDefaultComparator().isEqualTo(rotated);
    }

    @Test
    void rotate3x3() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotateImage.rotate(matrix);

        int[][] rotated = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};
        assertThat(matrix).usingDefaultComparator().isEqualTo(rotated);
    }

    @Test
    void rotate4x4() {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};
        rotateImage.rotate(matrix);

        int[][] rotated = new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}};
        assertThat(matrix).usingDefaultComparator().isEqualTo(rotated);
    }
}