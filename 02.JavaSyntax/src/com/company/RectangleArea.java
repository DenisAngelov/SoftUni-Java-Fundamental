package com.company;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        // Write a program that enters the sides of a rectangle (two integers a and b) and
        // calculates and prints the rectangle's area.

        Scanner sc = new Scanner(System.in);
        String[] rectangleSides = sc.nextLine().split(" ");
        int sideA = Integer.parseInt(rectangleSides[0]);
        int sideB = Integer.parseInt(rectangleSides[1]);
        System.out.println(sideA * sideB);

    }
}
