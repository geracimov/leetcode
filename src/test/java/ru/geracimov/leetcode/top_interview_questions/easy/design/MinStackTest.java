package ru.geracimov.leetcode.top_interview_questions.easy.design;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinStackTest {
    private MinStack minStack;

    @BeforeEach
    void setUp() {
        minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
    }

    @Test
    void push() {
        minStack.push(8);
        assertThat(minStack.top()).isEqualTo(8);
    }

    @Test
    void pop() {
        minStack.pop();
        assertThat(minStack.top()).isZero();
    }

    @Test
    void top() {
        assertThat(minStack.top()).isEqualTo(-3);
    }

    @Test
    void getMin() {
        assertThat(minStack.getMin()).isEqualTo(-3);
        minStack.pop();
        assertThat(minStack.getMin()).isEqualTo(-2);
    }
}