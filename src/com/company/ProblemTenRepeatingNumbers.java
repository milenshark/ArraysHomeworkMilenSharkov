package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemTenRepeatingNumbers {
    public static void main(String[] args) {

//        Problem 10. Repeating Numbers
//        Write a program that finds the repeating number. All other numbers occur only once.

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] == numbers[i - 1]) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
