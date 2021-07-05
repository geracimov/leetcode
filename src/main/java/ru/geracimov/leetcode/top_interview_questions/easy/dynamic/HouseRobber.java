package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

public class HouseRobber {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        int sumOdd = 0, sumEven = length % 2 == 0 ? 0 : nums[length - 1];

        for (int i = 0, j = 1; j < length; i += 2, j += 2) {
            sumOdd += nums[j];
            sumEven += nums[i];
        }
        return Math.max(sumEven, sumOdd);
    }
}
