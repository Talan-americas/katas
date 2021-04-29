package com.talan.interview.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzMainTest {

    @Test
    void doFizzBuzz() {
        //todo your test here
    }

    @Test
    void demoTest() {
        // here you can call your code with any argument:
        FizzBuzzMain.doFizzBuzz(4);
        // and you can use assertJ or usual junit assertions:
        assertThat(FizzBuzzMain.doFizzBuzz(4)).isEqualTo("");
        assertEquals(1, 1);
    }
}
