package ru.geracimov.leetcode.top_interview_questions.easy.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 * <p>Given an integer n, return a string array answer (1-indexed) where:</p>
 * <ul>
 *     <li>answer[i] == "FizzBuzz" if i is divisible by 3 and 5.</li>
 *     <li>answer[i] == "Fizz" if i is divisible by 3.</li>
 *     <li>answer[i] == "Buzz" if i is divisible by 5.</li>
 *     <li>answer[i] == i if non of the above conditions are true.</li>
 * </ul>
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (var i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
