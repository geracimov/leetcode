package ru.geracimov.leetcode.binary_search.background;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideIntArrayTargetExpected")
    @DisplayName("Если значение найдено - возвращается индекс найденного элемента в массиве")
    void search1(int[] nums, int target, int expected) {
        int result = solution.search(nums, target);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Если значение не найдено - возвращается -1")
    void search2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int result = solution.search(nums, 2);
        Assertions.assertEquals(-1, result);
    }

    private static Stream<Arguments> provideIntArrayTargetExpected() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{2, 5}, 5, 1),
                Arguments.of(new int[]{-1, 0, 5}, 5, 2)
        );
    }

}