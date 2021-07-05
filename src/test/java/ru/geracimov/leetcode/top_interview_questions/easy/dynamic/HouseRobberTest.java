package ru.geracimov.leetcode.top_interview_questions.easy.dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HouseRobberTest {
    private final HouseRobber houseRobber = new HouseRobber();

    @Test
    void rob() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertThat(houseRobber.rob(nums)).isEqualTo(4);
    }

    @Test
    void rob2() {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        assertThat(houseRobber.rob(nums)).isEqualTo(12);
    }
}