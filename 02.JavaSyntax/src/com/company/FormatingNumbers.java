package com.company;

import java.util.Scanner;

public class FormatingNumbers {

    public static void main(String[] args){

        // Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b
        // and a floating-point c and prints them in 4 virtual columns on the console.
        // Each column should have a width of 10 characters. The number a should be printed in hexadecimal,
        // left aligned; then the number a should be printed in binary form, padded with zeroes, then
        // the number b should be printed with 2 digits after the decimal point, right aligned;
        // the number c should be printed with 3 digits after the decimal point, left aligned.

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float c = Float.parseFloat(sc.nextLine());

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", Integer.toHexString(a).toUpperCase(),
                Integer.parseInt(Integer.toBinaryString(a)),
                b,
                c);

    }
}
