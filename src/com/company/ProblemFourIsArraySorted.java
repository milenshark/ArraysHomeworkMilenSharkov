package com.company;

import java.util.Scanner;

public class ProblemFourIsArraySorted {

    public static boolean isSorted(int[] arrayOne) {
        for (int i = 0; i < arrayOne.length - 1; i++) {
            if (arrayOne[i] > arrayOne[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        Problem 4. Is Array Sorted?
//        Write a program that determines if an array of integers is sorted in increasing order.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements N = ");
        int array = Integer.parseInt(scanner.nextLine());

        // Declaring the array
        int[] arrayOne = new int[array];

        // Filing the array
        for (int i = 0; i < array; i++) {
            arrayOne[i] = Integer.parseInt(scanner.next());
        }

        if (isSorted(arrayOne) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
