package ru.geracimov.leetcode.top_interview_questions.easy.design;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Shuffle an Array
 * <p>
 * Given an integer array nums, design an algorithm to randomly shuffle the array.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(int[] nums) Initializes the object with the integer array nums.
 * int[] reset() Resets the array to its original configuration and returns it.
 * int[] shuffle() Returns a random shuffling of the array.
 */
public class ShuffleArray {
    private final int[] original;
    private final Random rnd;

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int[] param_1 = obj.reset();
     * int[] param_2 = obj.shuffle();
     */
    public ShuffleArray(int[] nums) {
        original = nums;
        rnd = ThreadLocalRandom.current();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return original;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        var shuffled = new int[original.length];
        System.arraycopy(original, 0, shuffled, 0, original.length);
        for (var i = 0; i < original.length; i++) {
            var index = rnd.nextInt(i + 1);
            int a = shuffled[index];
            shuffled[index] = shuffled[i];
            shuffled[i] = a;
        }
        return shuffled;
    }
}
