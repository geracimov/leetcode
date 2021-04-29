package ru.geracimov.leetcode.binary_search.background;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write
 * a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -9999 <= nums[i], target <= 9999
 * All the integers in nums are unique.
 * nums is sorted in an ascending order.
 */
public class Solution {

    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

}