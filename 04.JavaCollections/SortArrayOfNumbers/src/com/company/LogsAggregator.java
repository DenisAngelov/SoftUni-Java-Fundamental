package com.company;

import java.util.*;

public class LogsAggregator {

    public static void main(String[] args){

        // You are given a sequence of access logs in format <IP> <user> <duration>.
        // Write a program to aggregate the logs data and print for each user the total duration
        // of his sessions and a list of unique IP addresses in format "<user>: <duration> [<IP1>, <IP2>, …]".
        // Order the users alphabetically. Order the IPs alphabetically.

        Scanner sc = new Scanner(System.in);
        int inputLength = Integer.parseInt(sc.nextLine());
        TreeMap<String, Integer> durations = new TreeMap<>();
        HashMap<String, TreeSet<String>> logs = new HashMap<>();
        for (int input = 0; input < inputLength; input++) {
            String[] log = sc.nextLine().split(" ");
            String user = log[1];
            String ip = log[0];
            int duration = Integer.parseInt(log[2]);

            Integer oldDuration = durations.get(user);
            if (oldDuration == null){
                oldDuration = 0;
            }

            durations.put(user, oldDuration + duration);

            TreeSet<String> ipSet = logs.get(user);
            if (ipSet == null){
                ipSet = new TreeSet<>();
            }
            ipSet.add(ip);
            logs.put(user, ipSet);

        }

        for (Map.Entry<String, Integer> userDuration : durations.entrySet()){
            String user = userDuration.getKey();
            int duration = userDuration.getValue();
            TreeSet<String> ipSet = logs.get(user);
            System.out.println(user + ": " + duration + " " + ipSet);
        }

    }
}
