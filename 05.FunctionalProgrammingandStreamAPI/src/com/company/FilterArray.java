package com.company;

import java.util.Arrays;

public class FilterArray {

    public static void main(String[] args) {

        // Write a program that filters an array of strings, leaving only the strings with
        // length greater than 3 characters. Use .filter().

        String[] words = {"Gosho", "gos", "pesho", "pes", "blabla", "bla"};

        Arrays.stream(words).filter(p -> p.length() > 3).forEach(System.out::printf);

    }
}
