package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemFiveFindTwoBiggestNumbers {
    public static void main(String[] args) {

//        Problem 5. Find Two Biggest Numbers
//        Write a program that finds the two biggest numbers from an array of integers

        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


//        int max1 = numbers[0];
//        int max2 = 0;
//        for (int i = 1; i <= numbers.length - 1; i++) {
//            if (max1 < numbers[i]) {
//                max1 = numbers[i];
//                max2 = max1;
//            }
//        }
//        System.out.println(max1 + " " + max2);


        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++)
        {
            if (max1 < numbers[i])
            {
                max2 = max1;
                max1 = numbers[i];
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
