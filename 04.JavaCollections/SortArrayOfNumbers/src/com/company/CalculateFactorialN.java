package com.company;

import java.util.Scanner;

public class CalculateFactorialN {

    public static void main(String[] args){

        // Write a program that recursively calculates factorial.

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int factNumber = GetFactorialNumber(number);
        System.out.println(factNumber);

    }

    static Integer GetFactorialNumber(int number){

        int result;
        if (number == 0){
            return 1;
        }

        result = GetFactorialNumber(number - 1) * number;
        return result;

    }

}
