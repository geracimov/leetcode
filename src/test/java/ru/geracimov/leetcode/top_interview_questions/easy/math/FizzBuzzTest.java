package ru.geracimov.leetcode.top_interview_questions.easy.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
private final FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void fizzBuzz() {
        assertThat(fizzBuzz.fizzBuzz(3)).containsExactly("1","2","Fizz");
        assertThat(fizzBuzz.fizzBuzz(5)).containsExactly("1","2","Fizz","4","Buzz");
        assertThat(fizzBuzz.fizzBuzz(15)).containsExactly("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
    }
}