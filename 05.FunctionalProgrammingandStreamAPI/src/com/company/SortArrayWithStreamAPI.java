package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {

    public static void main (String[] args){

        // Use the .sorted() method to sort an array of integers. The first line of input is the array.
        // The second is the sorting order.

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Integer[] numbers = new Integer[input.length];
        String sortingOrder = sc.nextLine();

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (sortingOrder.equals("Ascending")){
            Arrays.stream(numbers).sorted((n1, n2) -> n1.compareTo(n2)).forEach(System.out::println);
        }else if (sortingOrder.equals("Descending")){
            Arrays.stream(input).sorted((n1, n2) -> n2.compareTo(n1)).forEach(System.out::println);
        }else {
            System.out.println("Invalid Order");
        }

    }

}
