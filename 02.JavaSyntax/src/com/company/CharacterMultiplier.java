package com.company;

import java.util.Scanner;

public class CharacterMultiplier {

    public static void main(String[] args){

        // Create a method that takes two strings as arguments and returns the sum of their character codes
        // multiplied (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
        // Then continue with the next two characters. If one of the strings is longer than the other,
        // add the remaining character codes to the total sum without multiplication.

        Scanner sc = new Scanner(System.in);
        String firstInput = sc.next();
        String secondInput = sc.next();

        int result = GetCharacterResult(firstInput, secondInput);

        System.out.println(result);

    }

    static Integer GetCharacterResult (String firstInput, String secondInput){

        char[] firstWord = firstInput.toCharArray();
        char[] secondWord = secondInput.toCharArray();
        int smallerWord = firstWord.length > secondWord.length ? secondWord.length : firstWord.length;
        char[] biggerWord = firstWord.length > secondWord.length ? firstWord : secondWord;
        int result = 0;

        for (int i = 0; i < smallerWord; i++) {
            result+= firstWord[i] * secondWord[i];
        }

        for (int i = smallerWord; i < biggerWord.length; i++) {
            result+= biggerWord[i];
        }

        return result;

    }

}
