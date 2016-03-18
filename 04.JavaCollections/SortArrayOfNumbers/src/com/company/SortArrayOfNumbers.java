package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {

        // Write a program to enter a number n and n integer numbers and sort and print them.
        // Keep the numbers in array of integers: int[].

        Scanner sc = new Scanner(System.in);
        int arrayLength = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(numbers);

        for (Integer number : numbers){
            System.out.print(number + " ");
        }

    }
}
