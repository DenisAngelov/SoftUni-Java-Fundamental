package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {

    public static void main(String[] args){

        // Write a program that takes as input two integers N and M, and randomizes the numbers between them.
        // Note that M may be smaller than or equal to N.

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        int biggerNumber = n > m ? n : m;
        int smallerNumber = n < m ? n : m;
        List<Integer> numbers = new ArrayList<>();

        for (int i = smallerNumber; i <= biggerNumber; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (Integer number : numbers){
            System.out.print(number + " ");
        }

    }
}
