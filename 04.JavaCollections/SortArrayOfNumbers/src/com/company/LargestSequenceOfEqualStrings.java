package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

    public static void main(String[] args){

        // Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
        // If several sequences have the same longest length, print the leftmost of them.
        // The input strings are given as a single line, separated by a space.

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Map<String, Integer> occurances = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!occurances.containsKey(input[i])){
                occurances.put(input[i], 0);
            }
            occurances.put(input[i], occurances.get(input[i]) + 1);
        }

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : occurances.entrySet()){
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()){
                maxEntry = entry;
            }
        }

        for (int i = 0; i < maxEntry.getValue(); i++) {
            System.out.print(maxEntry.getKey() + " ");
        }

    }
}
