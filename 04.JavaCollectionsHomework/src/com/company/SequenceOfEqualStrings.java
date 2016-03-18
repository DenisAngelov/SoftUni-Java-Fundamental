package com.company;

import java.util.Scanner;

public class SequenceOfEqualStrings {

    public static void main(String[] args){

        // Write a program that enters an array of strings and finds in it all sequences of equal elements.
        // The input strings are given as a single line, separated by a space.

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {

            if (i == input.length-1){
                System.out.print(input[i]);
                break;
            }

            if (input[i].equals(input[i+1])){
                System.out.print(input[i] + " ");
            }else{
                System.out.println(input[i]);
            }

        }

    }
}