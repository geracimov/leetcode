package ru.geracimov.leetcode.binary_search.template1;

import org.junit.jupiter.api.Test;
import ru.geracimov.leetcode.binary_search.template2.FindMinimumInRotatedSortedArray;

import static org.assertj.core.api.Assertions.assertThat;

class FindMinimumInRotatedSortedArrayTest {
    private final FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    @Test
    void findMin() {
        assertThat(solution.findMin(new int[]{3, 4, 5, 1, 2})).isEqualTo(1);
        assertThat(solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2})).isZero();
        assertThat(solution.findMin(new int[]{11, 13, 15, 17})).isEqualTo(11);
    }
}