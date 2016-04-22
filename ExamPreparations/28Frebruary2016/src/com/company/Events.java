package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Events {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputLength = Integer.parseInt(sc.nextLine());
        HashMap<String, TreeMap<String, List<String>>> events = new HashMap<>();

        String regex = "^#([a-zA-Z]+):\\s*@([A-Za-z]+)\\s*(([0-1][0-9]|[2]?[0-3]):([0-5]?[0-9]))$";
        Pattern pattern = Pattern.compile(regex);

        for (int entry = 0; entry < inputLength; entry++) {

            String concertInfo = sc.nextLine();
            Matcher match = pattern.matcher(concertInfo);

            if (match.find()){

                String city = match.group(2);
                String singer = match.group(1);
                String time = match.group(3);

                if (!events.containsKey(city)){
                    events.put(city, new TreeMap<>());
                }

                if (!events.get(city).containsKey(singer)){
                    events.get(city).put(singer, new LinkedList<>());
                }

                events.get(city).get(singer).add(time);

            }

        }

        String[] requestedCity = sc.nextLine().split(",");
        Arrays.sort(requestedCity);

        for (String city : requestedCity) {

            if (events.containsKey(city)){

                System.out.println(city + ":");
                int counter = 1;
                String[] singers = new String[events.get(city).size()];
                events.get(city).keySet().toArray(singers);

                for (String singer : singers) {

                    System.out.printf("%d. %s -> ", counter, singer);
                    List<String> hours = events.get(city).get(singer);
                    hours.sort(String::compareTo);
                    String outputTime = hours.toString().replace("[", "").replace("]", "");
                    System.out.println(outputTime);
                    counter++;

                }

            }
        }

    }

}
