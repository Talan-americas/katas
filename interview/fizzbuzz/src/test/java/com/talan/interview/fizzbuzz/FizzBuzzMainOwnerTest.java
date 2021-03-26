package com.talan.interview.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzMainOwnerTest {

    @ParameterizedTest
    @MethodSource("doFizzBuzz")
    void doFizzBuzz(int index, String expected) {

        List<String> result = FizzBuzzMain.doFizzBuzz(100);
        assertThat(result.get(index)).isEqualTo(expected);
    }

    @Test
    void doFizzBuzz_0() {
        assertThat(FizzBuzzMain.doFizzBuzz(0)).hasSize(1).contains("FizzBuzz");
    }

    @Test
    void doFizzBuzz_10() {
        assertThat(FizzBuzzMain.doFizzBuzz(10)).hasSize(11);
    }

    public static Stream<Arguments> doFizzBuzz() {
        return Stream.of(
                Arguments.of(2, "Fizz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(10, "FizzBuzz"),
                Arguments.of(1, "1"),
                Arguments.of(7, "7"),
                Arguments.of(99, "99"),
                Arguments.of(0, "FizzBuzz")

        );
    }

}
