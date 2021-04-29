package ru.geracimov.leetcode.binary_search.template1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class GuessGame {
    private static final Logger LOGGER = Logger.getLogger(GuessGame.class.getSimpleName());
    private final int guessedNumber;

    protected GuessGame() {
        this.guessedNumber = new Random().nextInt() & Integer.MAX_VALUE;
        LOGGER.log(Level.INFO, "guessed {0}", guessedNumber);
    }

    protected int guess(int num) {
        return Integer.compare(guessedNumber, num);
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

}
