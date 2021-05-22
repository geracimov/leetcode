package ru.geracimov.leetcode.top_interview_questions.easy.array;

/**
 * Rotate Image
 * <p>
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    private void transpose(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    private void reflect(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                swap(matrix, i, j, i, length - j - 1);
            }
        }
    }

    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        if (matrix[i1][j1] != matrix[i2][j2]) {
            matrix[i1][j1] ^= matrix[i2][j2];
            matrix[i2][j2] ^= matrix[i1][j1];
            matrix[i1][j1] ^= matrix[i2][j2];
        }
    }

    @SuppressWarnings("unused")
    private void swap2(int[][] matrix, int i1, int j1, int i2, int j2) {
        if (matrix[i1][j1] != matrix[i2][j2]) {
            int tmp = matrix[i1][j1];
            matrix[i1][j1] = matrix[i2][j2];
            matrix[i2][j2] = tmp;
        }
    }

}
