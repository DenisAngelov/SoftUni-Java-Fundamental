package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {

    public static void main(String[] args){

        // Write a method that returns the first N odd/even elements from a collection.
        // Return as many as you can.

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (sc.hasNextInt()){
            numbers.add(sc.nextInt());
        }
        sc.nextLine();

        String[] command = sc.nextLine().split(" ");
        int numberOfItems = Integer.parseInt(command[1]);
        int parity = command[2].equals("even") ? 0 : 1;

        result = ReturnOddOrEvenNumbers(numbers, numberOfItems, parity);

        for (Integer number : result){
            System.out.print(number + " ");
        }

    }

    static List<Integer> ReturnOddOrEvenNumbers (List<Integer> numbers, int numberOfItems, int parity){

        List<Integer> desiredNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (desiredNumbers.size() == numberOfItems){
                break;
            }
            if (numbers.get(i) % 2 == parity) {
                desiredNumbers.add(numbers.get(i));
            }
        }

        return desiredNumbers;

    }

}
