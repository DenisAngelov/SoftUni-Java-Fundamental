package com.company;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniNumerals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> numbers = new HashMap();

        numbers.put("aa", "0");
        numbers.put("aba", "1");
        numbers.put("bcc", "2");
        numbers.put("cc", "3");
        numbers.put("cdc", "4");

        String data = sc.nextLine();
        String regex = "(aa|aba|bcc|cc|cdc)";
        Pattern pattern = Pattern.compile(regex);
        Matcher number = pattern.matcher(data);

        StringBuilder sb = new StringBuilder();

        while (number.find()){
            sb.append(numbers.get(number.group()));
        }

        BigInteger value = new BigInteger(sb.toString(), 5);

        System.out.println(value);

    }
}
