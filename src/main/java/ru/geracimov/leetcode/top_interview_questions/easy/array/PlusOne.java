package ru.geracimov.leetcode.top_interview_questions.easy.array;

/**
 * Plus One
 * <p>
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        var add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + add > 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + add;
                add = 0;
            }
        }
        if (add > 0) {
            digits = new int[digits.length + add];
            digits[0] = add;
        }
        return digits;
    }
}
