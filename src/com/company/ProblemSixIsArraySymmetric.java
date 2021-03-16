package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemSixIsArraySymmetric {
    public static void main(String[] args) {

//        Problem 6. Is Array Symmetric
//        Write a program that finds if an array of integers is symmetric - that is, the first number is equal
//        to the last, the second - to the second last and so on


        Scanner input = new Scanner(System.in);

        int N;
        int i;
        boolean sym = true;

        N = input.nextInt();
        int[] numbers = new int[N];

        for (i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        for (i = 0; i < N; i++) {
            if (numbers[i] != numbers[N - 1 - i]) {
                sym = false;
            }
        }

        if (sym == true) {
            System.out.println("The array is a symmetrical array");
        } else {
            System.out.println("The array is NOT a symmetrical array");
        }
    }
}

//        Scanner input = new Scanner(System.in);
//
//        int N;
//        int i;
//
//
//        N = input.nextInt();
//        int[] numbers = new int[N];
//
//        for (i = 0; i < N; i++) {
//            numbers[i] = input.nextInt();
//        }
//        i = 0;
//        while (i < N / 2 && numbers[i] == numbers[N - 1 - i]) {
//            i++;
//        }
//
//        if (i == N / 2) {
//            System.out.println("The array is a symmetrical array");
//        } else {
//            System.out.println("The array is NOT a symmetrical array");
//        }
//    }
//}


//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = Arrays
//                .stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        int N;
//        int i;
//
//        for (i = 0; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//        i = 0;
//        while (i < numbers.length / 2 && numbers[i] == numbers[numbers.length - 1 - i]) {
//            i++;
//        }
//
//        if (i == numbers.length / 2) {
//            System.out.println("The array is a symmetrical array");
//        } else {
//            System.out.println("The array is NOT a symmetrical array");
//        }