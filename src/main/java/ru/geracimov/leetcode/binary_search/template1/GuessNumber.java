package ru.geracimov.leetcode.binary_search.template1;

/**
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns 3 possible results:
 * <p>
 * -1: The number I picked is lower than your guess (i.e. pick < num).
 * 1: The number I picked is higher than your guess (i.e. pick > num).
 * 0: The number I picked is equal to your guess (i.e. pick == num).
 * <p>
 * Return the number that I picked.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2**31 - 1
 * 1 <= pick <= n
 */

public class GuessNumber extends GuessGame {

    public int guessNumber(int n) {
        var left = 1;
        var right = n;
        while (left <= right) {
            int mid = (left + (right - left) / 2);
            int guess = guess(mid);
            if (guess > 0) {
                left = mid + 1;
            } else if (guess < 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return n;
    }

}
