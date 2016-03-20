package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurences {

    public static void main(String[] args){

        //Write a program to find how many times given string appears in given text as substring.
        // The text is given at the first input line. The search string is given at the second input line.
        // The output is an integer number. Please ignore the character casing.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = sc.nextLine();
        Pattern regex = Pattern.compile(pattern);
        Matcher findSubstring = regex.matcher(input.toLowerCase());
        int wordsfound = 0;

        while (findSubstring.find()){
            wordsfound++;
        }

        System.out.println(wordsfound);

    }
}
