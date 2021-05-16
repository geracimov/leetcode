package ru.geracimov.leetcode.top_interview_questions.easy.others;

/**
 * Missing Number
 * <p>
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        var arr = new boolean[nums.length + 1];
        for (int num : nums) {
            arr[num] = true;
        }
        for (var i = 0; i < arr.length; i++) {
            if (!arr[i]) return i;
        }
        return 0;
    }
}
