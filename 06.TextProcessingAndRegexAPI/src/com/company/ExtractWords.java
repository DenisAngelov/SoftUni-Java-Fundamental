package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {

    public static void main(String[] args){

        //

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = "[a-zA-Z]+";
        Pattern regex = Pattern.compile(pattern);
        Matcher findWord = regex.matcher(input.toLowerCase());

        while (findWord.find()){
            System.out.print(findWord.group() + " ");
        }

    }

}
