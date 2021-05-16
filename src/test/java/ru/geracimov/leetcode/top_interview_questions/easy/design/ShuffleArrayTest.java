package ru.geracimov.leetcode.top_interview_questions.easy.design;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShuffleArrayTest {
    private ShuffleArray shuffleArray;

    @BeforeEach
    void setUp() {
        shuffleArray = new ShuffleArray(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void reset() {
        assertThat(shuffleArray.reset()).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void shuffle() {
        assertThat(shuffleArray.shuffle()).containsExactlyInAnyOrder(1, 2, 3, 4, 5);
    }
}