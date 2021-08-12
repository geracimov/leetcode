package ru.geracimov.leetcode.binary_search.template1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPeakElementTest {
    private FindPeakElement solution = new FindPeakElement();

    @Test
    void findPeakElement() {
        int[] ints = {1, 2, 3, 1};
        assertThat(solution.findPeakElement(ints)).isEqualTo(2);

        ints=new int[]{1,2,1,3,5,6,4};
        assertThat(solution.findPeakElement(ints)).isEqualTo(5);
    }
}