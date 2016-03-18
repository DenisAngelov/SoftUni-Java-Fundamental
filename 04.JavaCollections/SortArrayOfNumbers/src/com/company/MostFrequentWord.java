package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostFrequentWord {

    public static void main(String[] args){

        //Write a program to find the most frequent word in a text and print it, as well as how many times it appears
        // in format "word -> count". Consider any non-letter character as a word separator.
        // Ignore the character casing. If several words have the same maximal frequency,
        // print all of them in alphabetical order.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Integer> frequency = new TreeMap<>();
        Pattern regex = Pattern.compile("\\w+");
        Matcher match = regex.matcher(input.toLowerCase());

        while (match.find()){
            if (!frequency.containsKey(match.group())){
                frequency.put(match.group(), 0);
            }
            frequency.put(match.group(), frequency.get(match.group()) + 1);
        }

        Map.Entry<String, Integer> maxValue = null;

        for (Map.Entry<String, Integer> item : frequency.entrySet()){
            if (maxValue == null || item.getValue() > maxValue.getValue()){
                maxValue = item;
            }
        }

        for (Map.Entry<String, Integer> item : frequency.entrySet()){
            if (item.getValue() == maxValue.getValue()){
                System.out.print(item.getKey() + " -> " + item.getValue() + " times\n");
            }
        }

    }
}
