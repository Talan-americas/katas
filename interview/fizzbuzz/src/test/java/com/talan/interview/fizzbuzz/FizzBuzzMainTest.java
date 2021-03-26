package com.talan.interview.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzMainTest {

    @Test
    void test_negative_parameter_should_return_empty_list() {
        assertEquals(0, FizzBuzzMain.doFizzBuzz(-1).size());
//FizzBuzzMain.doFizzBuzz(123);
    }

    @Test
    void test_ten_argument() {
        assertEquals("Fizz", FizzBuzzMain.doFizzBuzz(10).get(2));
        assertEquals("Buzz", FizzBuzzMain.doFizzBuzz(10).get(5));
        assertEquals("FizzBuzz", FizzBuzzMain.doFizzBuzz(10).get(10));
        assertEquals("1", FizzBuzzMain.doFizzBuzz(10).get(1));

//FizzBuzzMain.doFizzBuzz(123);
    }
}
