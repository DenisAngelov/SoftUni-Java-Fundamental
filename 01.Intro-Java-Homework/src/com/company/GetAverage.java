package com.company;

import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args){

        //Create a method that finds the average of three numbers. Read in internet about java methods.
        // Check the naming conventions. Invoke your method and test it.
        // Format the output to two digits after the decimal separator. The placeholder is %.2f

        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float c = Float.parseFloat(sc.nextLine());

        float average = GetAverage(a, b, c);
        System.out.printf("%.2f", average);

    }

    static Float GetAverage(float a, float b, float c){
        return  (a + b + c) / 3;
    }

}
