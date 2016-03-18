package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CombineListsOfLetters {

    public static void main(String[] args){

        // Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters
        // c from l2 to the end of l1, but only when c does not appear in l1. Print the obtained combined list.
        // All lists are given as sequence of letters separated by a single space, each at a separate line.
        // Use ArrayList<Character> of chars to keep the input and output lists.

        Scanner sc = new Scanner(System.in);
        char[] firstInput = sc.nextLine().toCharArray();
        char[] secondInput = sc.nextLine().toCharArray();
        ArrayList<Character> firstWord = new ArrayList<>();
        ArrayList<Character> secondWord = new ArrayList<>();

        for (int i = 0; i < firstInput.length; i++) {
            if (!(firstInput[i] == ' ')){
                firstWord.add(firstInput[i]);
            }
        }

        for (int i = 0; i < secondInput.length; i++) {
            if (!(secondInput[i] == ' ')){
                secondWord.add(secondInput[i]);
            }
        }

        ArrayList<Character> result = firstWord;

        for (int i = 0; i < secondWord.size(); i++) {
            if (!firstWord.contains(secondWord.get(i))){
                result.add(secondWord.get(i));
            }
        }

        for (Character c : result){
            System.out.print(c + " ");
        }

    }
}