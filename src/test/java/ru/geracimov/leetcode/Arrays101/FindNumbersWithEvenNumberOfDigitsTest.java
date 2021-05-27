package ru.geracimov.leetcode.Arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindNumbersWithEvenNumberOfDigitsTest {
    private final FindNumbersWithEvenNumberOfDigits evenDigits = new FindNumbersWithEvenNumberOfDigits();

    @Test
    void findNumbers2() {
        assertThat(evenDigits.findNumbers(new int[]{12, 345, 2, 6, 7896})).isEqualTo(2);
    }

    @Test
    void findNumbers1() {
        assertThat(evenDigits.findNumbers(new int[]{555, 901, 482, 1771})).isEqualTo(1);
    }

}