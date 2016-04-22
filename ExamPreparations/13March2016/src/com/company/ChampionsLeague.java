package com.company;

import java.util.*;

public class ChampionsLeague {

    static TreeMap<String, ArrayList<String>> opponents = new TreeMap<>();
    static TreeMap<String, Integer> teamWins = new TreeMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String data;
        while (!(data = sc.nextLine()).equals("stop")){
            String[] matchInfo = data.split("[|]+");
            String teamOne = matchInfo[0].trim();
            String teamTwo = matchInfo[1].trim();
            String[] firstMatch = matchInfo[2].trim().split(":");
            String[] secondMatch = matchInfo[3].trim().split(":");

            int teamOneHomeGoals = Integer.parseInt(firstMatch[0]);
            int teamTwoAwayGoals = Integer.parseInt(firstMatch[1]);
            int teamOneAwayGoals = Integer.parseInt(secondMatch[1]);
            int teamTwoHomeGoals = Integer.parseInt(secondMatch[0]);

            if (teamOneAwayGoals + teamOneHomeGoals > teamTwoAwayGoals + teamTwoHomeGoals){
                StoreMatchInfo(teamOne, teamTwo);
            }else if (teamOneAwayGoals + teamOneHomeGoals < teamTwoAwayGoals + teamTwoHomeGoals){
                StoreMatchInfo(teamTwo, teamOne);
            }else if (teamOneAwayGoals + teamOneHomeGoals == teamTwoAwayGoals + teamTwoHomeGoals) {
                String winner = teamOneAwayGoals > teamTwoAwayGoals ? teamOne : teamTwo;
                String loser = teamOneAwayGoals > teamTwoAwayGoals ? teamTwo : teamOne;
                StoreMatchInfo(winner, loser);
            }
        }

        Map<String, Integer> sortedWins = sortByComparator(teamWins);
        for (Map.Entry<String, Integer> team : sortedWins.entrySet()) {
            System.out.println(team.getKey());
            System.out.printf("- Wins: %d\n", team.getValue());
            ArrayList<String> oponents = opponents.get(team.getKey());
            oponents.sort(String::compareTo);
            System.out.printf("- Opponents: %s", String.join(", ", oponents));
            System.out.println();
        }
    }
    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap) {
        // Convert Map to List
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
        // Sort list with comparator, to compare the Map values
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        // Convert sorted map back to a Map
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    private static void StoreMatchInfo(String winner, String loser) {
        if (teamWins.containsKey(winner)){
            teamWins.put(winner, teamWins.get(winner) + 1);
            ArrayList<String> opponent = opponents.get(winner);
            opponent.add(loser);
            opponents.put(winner, opponent);
        }else {
            teamWins.put(winner, 1);
            ArrayList<String> opponent = new ArrayList<>();
            opponent.add(loser);
            opponents.put(winner, opponent);
        }
        if (!teamWins.containsKey(loser)){
            teamWins.put(loser, 0);
            ArrayList<String> enemyOpponent = new ArrayList<>();
            enemyOpponent.add(winner);
            opponents.put(loser, enemyOpponent);
        }else {
            ArrayList<String> enemyOpponent = opponents.get(loser);
            enemyOpponent.add(winner);
            opponents.put(loser, enemyOpponent);
        }
    }

}
