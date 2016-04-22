package com.company;

import java.util.Scanner;

public class Monopoly {

    static int money;
    static int hotelsBought;
    static int turns;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] dimensions = sc.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        turns = 0;
        money = 50;
        hotelsBought = 0;

        for (int entry = 0; entry < rows; entry++) {

            char[] squaresOnBoard = sc.nextLine().toCharArray();

            if (entry % 2 == 0){
                MovePlayerRight(squaresOnBoard, entry + 1);
            }else {
                MovePlayerLeft(squaresOnBoard, entry + 1);
            }


        }

        System.out.println("Turns " + turns);
        System.out.println("Money " + money);

    }

    static void MovePlayerRight(char[] squaresOnBoard, int currRow){

        for (int turn = 0; turn < squaresOnBoard.length; turn++) {

            char currSquare = squaresOnBoard[turn];

            switch (currSquare){

                case 'H' :
                    hotelsBought++;
                    System.out.printf("Bought a hotel for %d. Total hotels: %d.\n", money, hotelsBought);
                    money = 0;
                    break;
                case 'J' :
                    System.out.printf("Gone to jail at turn %d.\n", turns);
                    turns += 2;
                    money += (hotelsBought * 10) * 2;
                    break;
                case 'S' :
                    int moneyToShop = (turn + 1) * currRow;
                    int moneyToPay = money - moneyToShop > 0 ? moneyToShop : money;
                    money -= moneyToPay;
                    System.out.printf("Spent %d money at the shop.\n", moneyToPay);
                    break;

            }

            turns++;
            money += hotelsBought * 10;

        }

    }

    static void MovePlayerLeft(char[] squaresOnBoard, int currRow){

        for (int turn = squaresOnBoard.length; turn > 0; turn--) {

            char currSquare = squaresOnBoard[turn - 1];

            switch (currSquare){

                case 'H' :
                    hotelsBought++;
                    System.out.printf("Bought a hotel for %d. Total hotels: %d.\n", money, hotelsBought);
                    money = 0;
                    break;
                case 'J' :
                    System.out.printf("Gone to jail at turn %d.\n", turns);
                    turns += 2;
                    money += (hotelsBought * 10) * 2;
                    break;
                case 'S' :
                    int moneyToShop = turn * currRow;
                    int moneyToPay = money - moneyToShop > 0 ? moneyToShop : money;
                    money -= moneyToPay;
                    System.out.printf("Spent %d money at the shop.\n", moneyToPay);
                    break;

            }

            turns++;
            money += hotelsBought * 10;

        }

    }

}
