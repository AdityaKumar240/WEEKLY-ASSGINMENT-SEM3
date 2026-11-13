package control_flow.assigment_problems;

import java.util.Scanner;

public class PositiveNegativeZeroClassifier {
    void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        new PositiveNegativeZeroClassifier().classifyNumber(number);
    }
}
