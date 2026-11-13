package java_arrays_and_methods.assigment_problems;
import java.util.Arrays;
public class FantasyLeagueAutoDraft {
    static class Player implements Comparable<Player> {
        String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;
        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }
    static String draftAndRank(Player[] players) {
        Player[] selected = new Player[players.length];
        int count = 0;
        for (Player p : players)
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured))
                selected[count++] = p;
        selected = Arrays.copyOf(selected, count);
        Arrays.sort(selected);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < selected.length; i++) {
            if (i > 0) result.append(" | ");
            result.append(i + 1).append(". ").append(selected[i].name);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(players));
    }
}