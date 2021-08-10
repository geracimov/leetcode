package ru.geracimov.leetcode.binary_search.template1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInRotatedSortedArrayTest {
    private final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    @Test
    void search() {
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)).isEqualTo(-1);
        assertThat(solution.search(new int[]{1}, 0)).isEqualTo(-1);
    }
}