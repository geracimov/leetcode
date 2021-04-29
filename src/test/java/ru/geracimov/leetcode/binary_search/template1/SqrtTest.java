package ru.geracimov.leetcode.binary_search.template1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SqrtTest {
    private final Sqrt sqrt = new Sqrt();

    @ParameterizedTest
    @MethodSource("provideInts")
    void sqrtTest(int target, int expected) {
        Assertions.assertEquals(expected, sqrt.mySqrt(target));
    }

    private static Stream<Arguments> provideInts() {
        return Stream.of(
                Arguments.of(4, 2),
                Arguments.of(8, 2),
                Arguments.of(9, 3),
                Arguments.of(16, 4),
                Arguments.of(20, 4),
                Arguments.of(26, 5)
        );
    }

}