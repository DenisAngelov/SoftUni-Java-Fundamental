package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {

    public static void main(String[] args){

        // Write a program to count the number of words in given sentence.
        // Use any non-letter character as word separator.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = "\\w+";
        Pattern regex = Pattern.compile(pattern);
        Matcher findWord = regex.matcher(input.toLowerCase());
        int wordsfound = 0;

        while (findWord.find()){
            wordsfound++;
        }

        System.out.println(wordsfound);

    }

}
