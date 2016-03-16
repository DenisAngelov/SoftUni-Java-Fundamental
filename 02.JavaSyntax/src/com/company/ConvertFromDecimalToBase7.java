package com.company;

import java.util.Scanner;

public class ConvertFromDecimalToBase7 {

    public static void main(String[] args){

        //Write a program that takes an integer number and converts it to base-7

        Scanner sc = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(sc.nextLine());
        System.out.println(Integer.toString(decimalNumber, 7));

    }
}
