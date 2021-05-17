package ru.geracimov.leetcode.top_interview_questions.easy.array;

/**
 * Rotate Array
 * <p>iven an array, rotate the array to the right by k steps, where k is non-negative.</p>
 * Constraints:
 * <ul>
 *     <li>1 <= nums.length <= 10^5</li>
 *     <li>-2^31 <= nums[i] <= 2^31 - 1</li>
 *     <li>0 <= k <= 10^5</li>
 * </ul>
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;
        var size = nums.length;
        k = k % size;
        if (k == 0) return;
        var temp = new int[k];
        System.arraycopy(nums, size - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, size - k);
        System.arraycopy(temp, 0, nums, 0, k);
    }
}
