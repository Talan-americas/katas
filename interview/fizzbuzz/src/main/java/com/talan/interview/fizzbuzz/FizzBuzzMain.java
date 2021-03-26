package com.talan.interview.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzMain {
    public static void main(String[] args) {
        printResult(doFizzBuzz(100));
    }

    public static List<String> doFizzBuzz(int n) {

        /* Return a list of elements from 0 to n included, as strings.
         * If element is even, then output "Fizz" instead
         * If element is multiple of 5, then output "Buzz" instead
         * If element is both even and multiple of 5, then output "FizzBuzz" instead
         */

        //todo your code here
        List<String> returnedList = new ArrayList<>();

        int count = 0;

        while (count <= n) {
            returnedList.add(count % 2 == 0 && count % 10 != 0 ? "Fizz" :
                    (count % 5 == 0 && count % 10 != 0 ? "Buzz" :
                            (count % 10 == 0 ? "FizzBuzz" : new Integer(count).toString())));
            count++;
        }

        return returnedList;
    }

    public static void printResult(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Row " + i + ":" + list.get(i));
        }
    }
}
