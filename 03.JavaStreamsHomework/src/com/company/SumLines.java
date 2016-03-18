package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {

    public static void main(String[] args) throws IOException {

        // Write a program that reads a text file and prints on the console the sum of the ASCII symbols
        // of each of its lines. Use BufferedReader in combination with FileReader.

        BufferedReader bfr = new BufferedReader(
                        new FileReader(
                                "resources/lines.txt"
                        )
        );

        String line;

        while ((line = bfr.readLine()) != null){

            int result = GetLineSum(line);
            System.out.println(result);
        }

    }

    static Integer GetLineSum (String line){

        char[] letters = line.toCharArray();
        int sum = 0;

        for (char letter : letters){
            sum+= letter;
        }

        return sum;
    }

}
