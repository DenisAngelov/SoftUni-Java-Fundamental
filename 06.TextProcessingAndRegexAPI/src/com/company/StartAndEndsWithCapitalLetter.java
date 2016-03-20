package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartAndEndsWithCapitalLetter {

    public static void main(String[] args){

        // Write a program that takes as input an array of strings are prints only the words that start
        // and end with capital letter. Words are only strings that consist of English alphabet letters.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern regex = Pattern.compile("\\b[A-Z]{1}[a-zA-Z]*[A-Z]{1}\\b");
        Matcher findWord = regex.matcher(input);

        while (findWord.find()){
            System.out.print(findWord.group() + " ");
        }

    }

}
