package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    void fibonacci0() {
        assertThat(fibonacci.fibonacci(0)).isEqualTo("0");
    }

    @Test
    void fibonacci2() {
        assertThat(fibonacci.fibonacci(2)).isEqualTo("2");
    }

    @Test
    void fibonacci6() {
        assertThat(fibonacci.fibonacci(6)).isEqualTo("8");
    }

    @Test
    void fibonacci20() {
        assertThat(fibonacci.fibonacci(20)).isEqualTo("6765");
    }

    @Test
    void fibonacci45() {
        assertThat(fibonacci.fibonacci(45)).isEqualTo("1134903170");
    }

    @Test
    void fibonacci110() {
        assertThat(fibonacci.fibonacci(110)).isEqualTo("43566776258854844738105");
    }

    @Test
    void fibonacci300() {
        assertThat(fibonacci.fibonacci(300)).isEqualTo("222232244629420445529739893461909967206666939096499764990979600");
    }
}