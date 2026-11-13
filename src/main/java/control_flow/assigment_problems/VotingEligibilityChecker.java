package control_flow.assigment_problems;

import java.util.Scanner;

public class VotingEligibilityChecker {
    void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        new VotingEligibilityChecker().checkVotingEligibility(age);
    }
}
