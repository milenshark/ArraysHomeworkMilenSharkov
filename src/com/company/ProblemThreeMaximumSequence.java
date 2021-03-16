package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemThreeMaximumSequence {
    public static void main(String[] args) {

//        Problem 3. Maximum Sequence
//        Write a program that finds the length of the maximum sequence of equal elements in an array of integers.

        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;

                if (counter > maxCount) {
                    maxCount = counter;
                    digit = numbers[i];
                }
            } else
                counter = 1;
        }

        System.out.println(maxCount);
    }
}