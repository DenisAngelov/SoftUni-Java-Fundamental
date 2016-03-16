package com.company;

import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args){

        //Write a program that converts the decimal number system to the ghetto numeral system.
        // In the ghetto, numbers are represented as following:
        //0 – Gee, 1 – Bro, 2 – Zuz, 3 – Ma, 4 – Duh, 5  - Yo, 6 – Dis, 7 – Hood, 8 – Jam, 9 – Mack

        Scanner sc = new Scanner(System.in);
        char[] numbers = sc.nextLine().toCharArray();
        String nickname = "";

        for (char number : numbers){
            switch (number){
                case '0':nickname += "Gee";break;
                case '1':nickname += "Bro";break;
                case '2':nickname += "Zuz";break;
                case '3':nickname += "Ma";break;
                case '4':nickname += "Duh";break;
                case '5':nickname += "Yo";break;
                case '6':nickname += "Dis";break;
                case '7':nickname += "Hood";break;
                case '8':nickname += "Jam";break;
                case '9':nickname += "Mack";break;
            }
        }

        System.out.println(nickname);

    }
}
