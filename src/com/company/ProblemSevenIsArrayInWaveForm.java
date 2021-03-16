package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemSevenIsArrayInWaveForm {
    public static void main(String[] args) {

//        Problem 7. Is Array in Wave Form
//        Write a program that determines if an array of integers is in Wave Form -
//        e.g. first > second < third > fourth < fifth > ...

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


    }
}
