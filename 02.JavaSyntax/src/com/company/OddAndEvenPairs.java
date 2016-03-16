package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddAndEvenPairs {

    public static void main(String[] args){

        // You are given an array of integers as a single line, separated by a space.
        // Write a program that checks consecutive pairs and prints if both are odd/even or not.
        // Note that the array length should also be an even number

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        if (numbers.size() % 2 == 1){
            System.out.println("Invalid length");
            return;
        }

        for (int i = 0; i <= (numbers.size() / 2 + 1); i+=2) {

            int currNum = numbers.get(i);
            int nextNum = numbers.get(i + 1);

            if (currNum % 2 == 0 && nextNum % 2 == 0){
                System.out.printf("%d, %d -> both are even", currNum, nextNum);
            }else if (currNum % 2 == 1 && nextNum % 2 == 1){
                System.out.printf("%d, %d -> both are odd", currNum, nextNum);
            }else {
                System.out.printf("%d, %d -> different", currNum, nextNum);
            }
            System.out.println();
        }

    }
}
