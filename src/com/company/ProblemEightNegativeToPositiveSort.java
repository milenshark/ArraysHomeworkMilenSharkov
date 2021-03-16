package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemEightNegativeToPositiveSort {
    public static void main(String[] args) {

//        Problem 8. Negative-Positive Sort
//        Write a program that moves all negative numbers to the beginning and all positive to the end,
//        without changing the order of positive negative.


        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        System.out.println("The sorted int array is:");
        for (int sortNumber : numbers) {
            System.out.print(sortNumber);
        }
    }
}
