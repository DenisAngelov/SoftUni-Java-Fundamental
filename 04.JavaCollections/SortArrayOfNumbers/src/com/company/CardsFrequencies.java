package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardsFrequencies {

    public static void main(String[] args){

        // We are given a sequence of N playing cards from a standard deck. The input consists of several cards
        // (face + suit), separated by a space. Write a program to calculate and print at the console
        // the frequency of each card face in format "card_face -> frequency". The frequency is calculated
        // by the formula appearances / N and is expressed in percentages with exactly 2 digits
        // after the decimal point. The card faces with their frequency should be printed in the order
        // of the card face's first appearance in the input. The same card can appear multiple times in
        // the input, but it's face should be listed only once in the output.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Integer> cards = new LinkedHashMap<>();
        Pattern regex = Pattern.compile("\\w+");
        Matcher match = regex.matcher(input);
        int numOfCards = 0;

        while (match.find()){
            if (!cards.containsKey(match.group())){
                cards.put(match.group(), 0);
            }
            cards.put(match.group(), cards.get(match.group()) + 1);
            numOfCards++;
        }

        float percentPerCard = 100 / numOfCards;

        for (Map.Entry<String, Integer> set : cards.entrySet()){
            System.out.printf("%s -> %.2f%%\n", set.getKey(), set.getValue() * percentPerCard);
        }

    }
}
