package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemElevenPairs {
    public static void main(String[] args) {

//        Problem 11. Pairs
//        Write a program that find all pairs of integers whose sum is equal to a given number.
//        On the first line you will receive the target sum, on the second line - the array.

        Scanner scanner = new Scanner(System.in);

        int desiredSumValue = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0; // Initialize result

        // Check all possible pairs and their sums
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if ((numbers[i] + numbers[j]) == desiredSumValue)
                    System.out.println(numbers[i] + ", " + numbers[j]);
                    count++;
    }
}
