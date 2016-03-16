package com.company;

import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args){

        // Write a program that reads three floating point numbers from the console and calculates their result with the following formulae:
        // ((a2 + b2) / (a2 – b2))(a + b + c) / √c      and       (a2 + b2 - c3)(a – b)
        // Then calculate the difference between the average of the three numbers and the average of the two formulae.
        // Average (a, b, c) – Average (f1, f2)

        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float c = Float.parseFloat(sc.nextLine());
        double formula1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)), ((a + b + c) / Math.sqrt(c)));
        double formula2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)),(a - b));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1,
                formula2,
                formula1 > formula2 ?
                        ((a + b + c)/3) - ((formula1 + formula2)/2) :
                        ((formula1 + formula2)/2) - ((a + b + c)/3));

    }
}
