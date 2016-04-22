package com.company;

import java.util.Scanner;

public class ParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(" ");

        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);

        String command;
        boolean[][] parking = new boolean[rows][cols];

        while (!(command = sc.nextLine()).equals("stop")) {

            data = command.split(" ");
            int entryRow = Integer.parseInt(data[0]);
            int desiredRow = Integer.parseInt(data[1]);
            int desiredCol = Integer.parseInt(data[2]);

            if (rowIsFull(parking, desiredRow)){
                System.out.printf("Row %d full\n", desiredRow);
            }else {

                int moves = Math.abs(desiredRow - entryRow) + 1;

                if (!parking[desiredRow][desiredCol]){
                    parking[desiredRow][desiredCol] = true;
                    moves += desiredCol;
                    System.out.println(moves);
                }else {

                    int length = Math.max(1, desiredCol);

                    for (int spot = 1; spot < length; spot++) {
                        int leftSpot = Math.max(1, desiredCol - spot);
                        int rightSpot = Math.min(cols - 1, desiredCol + spot);

                        if (!parking[desiredRow][leftSpot]){
                            moves += leftSpot;
                            parking[desiredRow][leftSpot] = true;
                        }else if (!parking[desiredRow][rightSpot]){
                            moves += rightSpot;
                            parking[desiredRow][rightSpot] = true;
                        }

                    }
                    System.out.println(moves);
                }
            }
        }
    }

    private static boolean rowIsFull(boolean[][] parking, int desiredRow) {
        for (int col = 1; col < parking[desiredRow].length; col++) {
            if (!parking[desiredRow][col]){
                return false;
            }
        }
        return true;
    }
}
