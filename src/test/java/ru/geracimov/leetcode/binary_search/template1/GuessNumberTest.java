package ru.geracimov.leetcode.binary_search.template1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class GuessNumberTest {

    @RepeatedTest(50)
    void guessNumber() {
        GuessNumber guessNumber = new GuessNumber();
        Assertions.assertEquals(guessNumber.getGuessedNumber(), guessNumber.guessNumber(Integer.MAX_VALUE));
    }

}