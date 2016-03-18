package com.company;

import java.util.*;

public class LongestIncreasingSequence {

    public static void main(String[] args){

        // Write a program to find all increasing sequences inside an array of integers.
        // The integers are given in a single line, separated by a space.
        // Print the sequences in the order of their appearance in the input array, each at a single line.
        // Separate the sequence elements by a space. Find also the longest increasing sequence
        // and print it at the last line. If several sequences have the same longest length, print the leftmost of them.

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        List<List<Integer>> sequences = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();
        sequence.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]){
                sequence.add(numbers[i]);
            }else {
                sequences.add(sequence);
                sequence = new ArrayList<>();
                sequence.add(numbers[i]);
            }
        }

        sequences.add(sequence);

        for (List<Integer> seq : sequences){
            for (Integer number : seq){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        List<Integer> longestSequence = new ArrayList<>();

        for (int i = 1; i < sequences.size(); i++) {
            if (sequences.get(i).size() > longestSequence.size()){
                longestSequence = sequences.get(i);
            }
        }

        System.out.print("Longest:");
        for (Integer number : longestSequence){
            System.out.print(" " + number);
        }

    }
}
