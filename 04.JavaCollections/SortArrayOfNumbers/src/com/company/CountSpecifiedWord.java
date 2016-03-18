package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {

    public static void main(String[] args){

        // Write a program to find how many times a word appears in given text.
        // The text is given at the first input line. The target word is given at the second input line.
        // The output is an integer number. Please ignore the character casing.
        // Consider that any non-letter character is a word separator.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = sc.nextLine() + "\\s";

        Pattern regex = Pattern.compile(pattern);
        Matcher match = regex.matcher(input.toLowerCase());
        int wordFound = 0;

        while (match.find()){
            wordFound++;
        }

        System.out.println(wordFound);

    }
}
