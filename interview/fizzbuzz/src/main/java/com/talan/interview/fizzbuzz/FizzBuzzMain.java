package com.talan.interview.fizzbuzz;

import lombok.extern.log4j.Log4j2;

import java.util.Collections;
import java.util.List;

@Log4j2
public class FizzBuzzMain {
    public static void main(String[] args) {

        printResult(doFizzBuzz(100));
    }

    /**
     * Returns a list of elements from 0 to n included, as strings.
     * If element is even (multiple of 2), then output "Fizz" instead
     * If element is multiple of 5, then output "Buzz" instead
     * If element is both even (multiple of 2) and multiple of 5, then output "FizzBuzz" instead
     *
     * @param n upper bound up to which compute the results
     * @return the list of String following rules above, from 0 to n included
     */
    public static List<String> doFizzBuzz(int n) {

        //todo your code here
        return Collections.emptyList();
    }

    public static void printResult(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Row " + i + ":" + list.get(i));
        }
    }
}
