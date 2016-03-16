package com.company;


import java.util.Scanner;

public class PrintACharacterTriangle {

    public static void main(String[] args){

        //Create a triangle of characters, based on input. Learn about java.util.Scanner and Integer.parseInt ().
        // Test your program with integers up to 26. Think why.

        Scanner sc = new Scanner(System.in);
        int triangleLength = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= triangleLength; i++) {
            for (char j = 0; j < i; j++) {
                System.out.print((char)(j + 97) + " ");
            }
            System.out.println();
        }

        for (int i = triangleLength-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j + 97) + " ");
            }
            System.out.println();
        }

    }
}
