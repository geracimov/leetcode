package ru.geracimov.leetcode.top_interview_questions.easy.others;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return bitCount(x ^ y);
    }

    public int bitCount(int n) {
        var s = 0;
        do {
            s += n & 1;
        } while ((n = n >>> 1) != 0);
        return s;
    }
}
