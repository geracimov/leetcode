package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {
    private RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement() {
        int[] nums = {3, 2, 2, 3};
        int actual = removeElement.removeElement(nums, 3);
        assertThat(actual).isEqualTo(2);
        assertThat(Arrays.copyOfRange(nums, 0, actual)).containsExactlyInAnyOrder(2, 2);
    }

    @Test
    void removeElement2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int actual = removeElement.removeElement(nums, 2);
        assertThat(actual).isEqualTo(5);
        assertThat(Arrays.copyOfRange(nums, 0, actual)).containsExactlyInAnyOrder(0, 1, 4, 0, 3);
    }
}