package ru.geracimov.leetcode.top_interview_questions.easy.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @ParameterizedTest
    @MethodSource("provideInts")
    void reverse(int original, int reversed) {
        assertThat(reverseInteger.reverse(original)).isEqualTo(reversed);
    }

    private static Stream<Arguments> provideInts() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(-1231, -1321),
                Arguments.of(120, 21),
                Arguments.of(0, 0),
                Arguments.of(1534236469, 0),
                Arguments.of(2147483647, 0),
                Arguments.of(-2147483648, 0),
                Arguments.of(-2147483412, -2143847412)
        );
    }
}