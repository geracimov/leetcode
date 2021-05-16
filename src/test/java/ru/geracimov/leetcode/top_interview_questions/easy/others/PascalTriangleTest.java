package ru.geracimov.leetcode.top_interview_questions.easy.others;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PascalTriangleTest {
    private final PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    void generate() {
        assertThat(pascalTriangle.generate(5).toString())
                .hasToString("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
        assertThat(pascalTriangle.generate(1).toString())
                .hasToString("[[1]]");
    }
}