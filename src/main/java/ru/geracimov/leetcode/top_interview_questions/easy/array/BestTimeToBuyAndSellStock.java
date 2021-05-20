package ru.geracimov.leetcode.top_interview_questions.easy.array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        var maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
