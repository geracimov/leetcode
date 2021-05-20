package ru.geracimov.leetcode.top_interview_questions.easy.sorting_searching;

/**
 * First Bad Version
 * <p>
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
    private final int firstFail;

    public FirstBadVersion(int firstFail) {
        this.firstFail = firstFail;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int med = start + (end - start) / 2;
            if (isBadVersion(med)) {
                end = med;
            } else {
                start = med + 1;
            }
        }
        return start;
    }

    private boolean isBadVersion(int version) {
        return version >= firstFail;
    }
}
