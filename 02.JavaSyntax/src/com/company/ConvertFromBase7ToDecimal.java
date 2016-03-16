package com.company;


import java.util.Scanner;

public class ConvertFromBase7ToDecimal {

    public static void main(String[] args){

        //Write a program that converts from a base-7 number to its decimal representation
        Scanner sc = new Scanner(System.in);
        String base7Number = sc.nextLine();

        System.out.println(Integer.valueOf(base7Number, 7));

    }
}
