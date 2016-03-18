package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountCharacterTypes {

    public static void main (String[] args) throws IOException{

        // Write a program that reads a list of words from the file words.txt and finds the count
        // of vowels (гласни букви), consonants (съгласни) and other punctuation marks.
        // Since English is a bit tricky, assume that a, e, i, o, u are vowels and all others are consonants.
        // Punctuation marks are (!,.?). Do not count whitespace.
        // Write the results in file count-chars.txt.

        BufferedReader bfr = new BufferedReader(
                new FileReader(
                        "resources03/words.txt"
                )
        );

        String line;
        List<Integer> charTypes = new ArrayList<>();
        int vowel = 0;
        int consonants = 0;
        int punctuation = 0;

        while ((line = bfr.readLine()) != null){

            charTypes = CountCharacterTypes(line);
            vowel += charTypes.get(0);
            punctuation += charTypes.get(1);
            consonants += charTypes.get(2);
        }

        FileWriter fwriter = new FileWriter(new File("resources03/count-chars.txt"));
        fwriter.write("Vowels: " + vowel);
        fwriter.write(System.lineSeparator());
        fwriter.write("Consonants: " + consonants);
        fwriter.write(System.lineSeparator());
        fwriter.write("Punctuation: " + punctuation);
        fwriter.write(System.lineSeparator());
        fwriter.close();

    }
    static List<Integer> CountCharacterTypes(String line){
        char[] lineElems = line.toCharArray();
        char[] vowels = {'a', 'e', 'u', 'i', 'o'};
        char[] punctuation = {'!', ',', '.', '?'};
        char whitespace = ' ';

        List<Integer> typeCount = new ArrayList<Integer>();

        int vowelsCount = 0;
        int puncCount = 0;
        int spaceCount = 0;

        for (char c : lineElems) {

            for (char ch : vowels){
                if (c == ch){
                    vowelsCount++;
                }
            }

            for (char ch : punctuation){
                if (c == ch){
                    puncCount++;
                }
            }

            if (c == whitespace) {
                spaceCount++;
            }

        }

        int consonantsCount = lineElems.length - (puncCount + vowelsCount + spaceCount);

        typeCount.add(vowelsCount);
        typeCount.add(puncCount);
        typeCount.add(consonantsCount);

        return typeCount;

    }

}
