package ru.geracimov.leetcode.top_interview_questions.easy.array;

import java.util.Arrays;

/**
 * Valid Sudoku
 * <p>
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * <p>
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {
    final static char EMPTY = '!';
    private char[] tempArray;

    public boolean isValidSudoku(char[][] board) {
        tempArray = new char[board.length];
        return rowValidation(board) && columnValidation(board) && subBoxesValidation(board);
    }

    private boolean rowValidation(char[][] board) {
        for (var line : board) {
            Arrays.fill(tempArray, EMPTY);
            for (char c : line) {
                int tempIndex = getTempIndex(c);
                if (tempIndex < 0) continue;
                if (tempArray[tempIndex] != EMPTY)
                    return false;
                else tempArray[tempIndex] = c;
            }
        }
        return true;
    }

    private boolean columnValidation(char[][] board) {
        for (var i = 0; i < board.length; i++) {
            Arrays.fill(tempArray, EMPTY);
            for (char[] chars : board) {
                char c = chars[i];
                int tempIndex = getTempIndex(c);
                if (tempIndex < 0) continue;
                if (tempArray[tempIndex] != EMPTY)
                    return false;
                else tempArray[tempIndex] = c;
            }
        }
        return true;
    }

    private boolean subBoxesValidation(char[][] board) {
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                Arrays.fill(tempArray, EMPTY);
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char c = board[i + k][j + l];
                        int tempIndex = getTempIndex(c);
                        if (tempIndex < 0) continue;
                        if (tempArray[tempIndex] != EMPTY)
                            return false;
                        else tempArray[tempIndex] = c;
                    }
                }
            }
        }
        return true;
    }

    private int getTempIndex(char c) {
        return c - '1';
    }

}
