package arrays_and_strings.assigment_problems;
public class TrafficSignalStreak {
    static void findLongestStreak(String signalLog) {
        if (signalLog.length() == 0) return;
        int count = 1, max = 1;
        char best = signalLog.charAt(0);
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) count++;
            else count = 1;
            if (count > max) {
                max = count;
                best = signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + best + "' repeated " + max + " times");
    }
    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}