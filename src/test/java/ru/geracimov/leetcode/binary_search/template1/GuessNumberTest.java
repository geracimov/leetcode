package ru.geracimov.leetcode.binary_search.template1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GuessNumberTest {

    @RepeatedTest(50)
    void guessNumber() {
        GuessNumber guessNumber = new GuessNumber();
        Assertions.assertEquals(guessNumber.getGuessedNumber(), guessNumber.guessNumber(Integer.MAX_VALUE));
    }

    @Test
    void guessNumberOne() {
        GuessNumber guessNumber = new GuessNumber(1);
        Assertions.assertEquals(guessNumber.getGuessedNumber(), guessNumber.guessNumber(1));
    }

}