package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllUniqueWords {

    public static void main(String[] args){

        // At the first line at the console you are given a piece of text.
        // Extract all words from it and print them in alphabetical order.
        // Consider each non-letter character as word separator.
        // Take the repeating words only once. Ignore the character casing.
        // Print the result words in a single line, separated by spaces.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> words = new ArrayList<>();
        Pattern regex = Pattern.compile("\\w+");
        Matcher match = regex.matcher(input.toLowerCase());

        while (match.find()){
            if (!words.contains(match.group())){
                words.add(match.group());
            }
        }

        Collections.sort(words);

        for (String word : words){
            System.out.print(word + " ");
        }

    }
}
