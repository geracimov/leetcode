package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void maxSubArray() {
        assertThat(maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    }
    @Test
    void maxSubArray2() {
        assertThat(maximumSubarray.maxSubArray(new int[]{1})).isEqualTo(1);
    }
    @Test
    void maxSubArray3() {
        assertThat(maximumSubarray.maxSubArray(new int[]{5,4,-1,7,8})).isEqualTo(23);
    }
//    @Test
//    void maxSubArray4() {
//        assertThat(maximumSubarray.maxSubArray(new int[]{-2,1})).isEqualTo(1);
//    }
}