package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumCards {

    public static void main(String[] args){

        // The game uses a standard deck of 52 cards. The card faces are: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A.
        // The cards suits are denoted by the letters S (spades), H (hearts), D (diamonds) and C (clubs).
        // The player is given a hand of cards and he needs to count their sum. Card values are the following:
        // 2 -> 2, 3 -> 3, 4 -> 4, 5 -> 5, 6 -> 6, 7 -> 7, 8 -> 8, 9 -> 9, 10 -> 10, J -> 12, Q -> 13, K -> 14, A -> 15
        // (the card suits are ignored).
        // When two or more cards of the same face come sequentially, their values are counted twice.
        // Write a program that takes a hand of cards and counts their sum.

        Scanner sc = new Scanner(System.in);
        String cardHand = sc.nextLine();
        Pattern regex = Pattern.compile("\\d+|(A)|(K)|(Q)|(J)");
        Matcher cardFind = regex.matcher(cardHand);
        List<Integer> cards = new LinkedList<>();
        int handPoints = 0;

        while (cardFind.find()){
            switch (cardFind.group()){
                case "A": cards.add(15);break;
                case "K": cards.add(14);break;
                case "Q": cards.add(13);break;
                case "J": cards.add(12);break;
                default: cards.add(Integer.parseInt(cardFind.group()));
            }
        }

        if (cards.size() == 1){
            handPoints += cards.get(0);
            System.out.println(handPoints);
            return;
        }

        if (cards.get(0) == cards.get(1)){
            handPoints += cards.get(0) * 2;
        }else{
            handPoints += cards.get(0);
        }

        for (int i = 1; i < cards.size(); i++) {
            if (!(i == cards.size() - 1)){
                if (cards.get(i) == cards.get(i + 1) || cards.get(i) == cards.get(i - 1)){
                    handPoints += cards.get(i) * 2;
                }else{
                    handPoints += cards.get(i);
                }
            }else {
                if (cards.get(i) == cards.get(i - 1)){
                    handPoints += cards.get(i) * 2;
                }else{
                    handPoints += cards.get(i);
                }
            }

        }

        System.out.println(handPoints);

    }
}