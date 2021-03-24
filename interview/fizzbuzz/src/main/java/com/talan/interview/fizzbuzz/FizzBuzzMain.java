package com.talan.interview.fizzbuzz;

import java.util.Collections;
import java.util.List;

public class FizzBuzzMain {
    public static void main(String[] args) {

        printResult(doFizzBuzz(100));
    }

    public static List<String> doFizzBuzz(int n) {

        /* Return a list of elements from 0 to n included, as strings.
         * If element is even, then output "Fizz" instead
         * If element is multiple of 5, then output "Buzz" instead
         * If element is both, then output "FizzBuzz" instead
         */

        //todo your code here

        return Collections.emptyList();
    }

    public static void printResult(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Row " + i + ":" + list.get(i));
        }
    }
}
