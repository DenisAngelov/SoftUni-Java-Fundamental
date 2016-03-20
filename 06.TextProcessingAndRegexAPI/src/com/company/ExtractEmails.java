package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {

        // Write a program to extract all email addresses from given text. The text comes at the first input line.
        // Print the emails in the output, each at a separate line. Emails are considered to be in format <user>@<host>.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String emailPattern = "\\w+@\\w+.\\w{2,4}(\\.\\w{2,4})?";
        Pattern regex = Pattern.compile(emailPattern);
        Matcher findEmail = regex.matcher(input);

        while (findEmail.find()){

            System.out.println(findEmail.group());

        }

    }
}
