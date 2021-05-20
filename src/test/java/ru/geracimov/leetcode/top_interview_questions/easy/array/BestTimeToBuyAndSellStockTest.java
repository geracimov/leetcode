package ru.geracimov.leetcode.top_interview_questions.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
    @Test
    void maxProfit() {
        int i = stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}