package com.company;

import java.util.Scanner;

public class SumNumbersFrom1ToN {

    public static void main(String[] args){

        //Create a Java program that reads a number N from the console
        // and calculates the sum of all numbers from 1 to N (inclusive).

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        System.out.println(result);

    }
}
