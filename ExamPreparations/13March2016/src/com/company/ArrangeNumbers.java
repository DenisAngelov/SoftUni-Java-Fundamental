package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class ArrangeNumbers {

    static TreeMap<String, Integer> sortedNumbers = new TreeMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();

        for (int num = 0; num < data.length; num++) {
            String currLetterNum = numberBuild(data[num]);
            int currNum = Integer.parseInt(data[num]);
            sortedNumbers.put(currLetterNum, currNum);
        }

        System.out.println(sb.toString());

        int itterator = 0;

        for (Map.Entry number : sortedNumbers.entrySet()){
            if (itterator != sortedNumbers.size() - 1){
                System.out.print(number.getValue() + ", ");
            }else {
                System.out.println(number.getValue());
            }
            itterator++;
        }
    }

    static String numberBuild(String number){

        char[] numberAsWords = number.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int letter = 0; letter < numberAsWords.length; letter++) {
            String currLetter;
            switch (numberAsWords[letter]){
                case '0': currLetter = "zero";break;
                case '1': currLetter = "one";break;
                case '2': currLetter = "two";break;
                case '3': currLetter = "three";break;
                case '4': currLetter = "four";break;
                case '5': currLetter = "five";break;
                case '6': currLetter = "six";break;
                case '7': currLetter = "seven";break;
                case '8': currLetter = "eight";break;
                case '9': currLetter = "nine";break;
                default : currLetter = "error";break;
            }
            sb.append(currLetter);
            if (letter != numberAsWords.length - 1){
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
