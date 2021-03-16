package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemOneCompareArrays {
    public static void main(String[] args) {

//        Problem 1. Compare arrays
//        Write a program that reads two int arrays of size N from the console and compares them element by element.
//
//        Input:
//        On the first line, you will receive the number N
//        On the next N lines the numbers of the first array will be given
//        On the next N lines the numbers of the second array will be given
//
//        Output:
//        Print Equal if the two arrays are the same and Not equal if they are not

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements N = ");
        int array = Integer.parseInt(scanner.nextLine());

        // Declaring the arrayOne
        int[] arrayOne = new int[array];

        // Filing the arrayOne
        for (int i = 0; i < array; i++) {
            System.out.printf("arrayOne[%d] = ", i);
            arrayOne[i] = Integer.parseInt(scanner.nextLine());
        }

        // Declaring the arrayTwo
        int[] arrayTwo = new int[array];

        // Filing the arrayTwo
        for (int i = 0; i < array; i++) {
            System.out.printf("arrayTwo[%d] = ", i);
            arrayTwo[i] = Integer.parseInt(scanner.nextLine());
        }

        if (Arrays.equals(arrayOne, arrayTwo))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
