package ru.geracimov.leetcode.arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuplicateZerosTest {
    private final DuplicateZeros duplicateZeros = new DuplicateZeros();

    @Test
    void duplicateZeros0() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(0, 0, 0, 0, 0, 0, 0);
    }

    @Test
    void duplicateZeros() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(1, 0, 0, 2, 3, 0, 0, 4);
    }

    @Test
    void duplicateZeros2() {
        int[] arr = {1, 2, 3};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(1, 2, 3);
    }

    @Test
    void duplicateZeros3() {
        int[] arr = {9, 9, 9, 4, 8, 0, 0, 3, 7, 2, 0, 0, 0, 0};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(9, 9, 9, 4, 8, 0, 0, 0, 0, 3, 7, 2, 0, 0);
    }

    @Test
    void duplicateZeros4() {
        int[] arr = {0, 1, 7, 6, 0, 2, 0, 7};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(0, 0, 1, 7, 6, 0, 0, 2);
    }

    @Test
    void duplicateZeros5() {
        int[] arr = {8, 4, 5, 0, 0, 0, 0, 7};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(8, 4, 5, 0, 0, 0, 0, 0);
    }

    @Test
    void duplicateZeros6() {
        int[] arr = {9, 9, 9, 4, 8, 0, 0, 3, 7, 2, 0, 0, 0, 0, 9, 1, 0, 0, 1, 1, 0, 5, 6, 3, 1, 6, 0, 0, 2, 3, 4, 7, 0, 3, 9, 3, 6, 5, 8, 9, 1, 1, 3, 2, 0, 0, 7, 3, 3, 0, 5, 7, 0, 8, 1, 9, 6, 3, 0, 8, 8, 8, 8, 0, 0, 5, 0, 0, 0, 3, 7, 7, 7, 7, 5, 1, 0, 0, 8, 0, 0};
        duplicateZeros.duplicateZeros(arr);
        assertThat(arr).containsExactly(9, 9, 9, 4, 8, 0, 0, 0, 0, 3, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 1, 1, 0, 0, 5, 6, 3, 1, 6, 0, 0, 0, 0, 2, 3, 4, 7, 0, 0, 3, 9, 3, 6, 5, 8, 9, 1, 1, 3, 2, 0, 0, 0, 0, 7, 3, 3, 0, 0, 5, 7, 0, 0, 8, 1, 9, 6, 3, 0, 0, 8, 8, 8, 8, 0);
    }
}