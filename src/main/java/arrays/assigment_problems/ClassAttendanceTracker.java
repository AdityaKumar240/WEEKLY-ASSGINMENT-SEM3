package arrays.assigment_problems;
import java.util.*;
public class ClassAttendanceTracker {
    static int[] attendanceSummary(int[] days) {
        int present = 0, streak = 0, longest = 0;
        for (int day : days) {
            if (day == 1) {
                present++;
                streak++;
                longest = Math.max(longest, streak);
            } else {
                streak = 0;
            }
        }
        return new int[]{present, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] days = new int[n];
        for (int i = 0; i < n; i++)
            days[i] = sc.nextInt();
        int[] ans = attendanceSummary(days);
        System.out.println("Present: " + ans[0] + ", Longest streak: " + ans[1]);
    }
}