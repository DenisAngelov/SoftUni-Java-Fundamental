package com.company;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args){

        // Write a program that enters 3 points in the plane (as integer x and y coordinates),
        // calculates and prints the area of the triangle composed by these 3 points.
        // Round the result to a whole number. 
        // In case the three points do not form a triangle, print "0" as result.

        Scanner sc = new Scanner(System.in);
        int aX = sc.nextInt();
        int aY = sc.nextInt();
        int bX = sc.nextInt();
        int bY = sc.nextInt();
        int cX = sc.nextInt();
        int cY = sc.nextInt();
        sc.nextLine();

        int result = ((aX*(bY - cY)) + (bX*(cY - aY)) + (cX*(aY - bY))) / 2;
        System.out.println(Math.abs(result));

    }
}
