package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class CollectResources {

    static boolean[] resourcesGathered;
    static HashSet<String> validResources = new HashSet<>();
    static String[] field;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        validResources = new HashSet<String>();
        validResources.add("stone");
        validResources.add("gold");
        validResources.add("food");
        validResources.add("wood");

        field = sc.nextLine().split(" ");
        int numberOfPaths = Integer.parseInt(sc.nextLine());
        int maxGoldFound = 0;

        for (int path = 0; path < numberOfPaths; path++) {

            resourcesGathered = new boolean[field.length];
            String[] moves = sc.nextLine().split(" ");
            int start = Integer.parseInt(moves[0]);
            int step = Integer.parseInt(moves[1]);

            int currGold = GetResource(start);
            int currPosition = (start + step) % field.length;

            while (!resourcesGathered[currPosition]){
                currGold += GetResource(currPosition);
                currPosition = (currPosition + step) % field.length;
            }

            if (currGold > maxGoldFound) {
                maxGoldFound = currGold;
            }

        }

        System.out.println(maxGoldFound);

    }

    private static int GetResource(int position) {

        String[] currPath = field[position].split("_");
        String resource = currPath[0];

        if (validResources.contains(resource)){
            resourcesGathered[position] = true;
            return currPath.length > 1 ? Integer.parseInt(currPath[1]) : 1;
        }

        return 0;
    }
}
