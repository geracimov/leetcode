package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxExtremum = Integer.MIN_VALUE;
        int sum = 0;
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > maxExtremum) {
                maxExtremum = sum;
                high = i;
            }
        }
        sum = maxExtremum;
        maxExtremum = Integer.MIN_VALUE;
        int low = 0;
        for (int i = high - 1; i >= 0; i--) {
            sum = sum + nums[i];
            if (sum > maxExtremum) {
                maxExtremum = sum;
                low = i;
            }
        }
        sum = 0;
        for (int i = low; i <= high; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
