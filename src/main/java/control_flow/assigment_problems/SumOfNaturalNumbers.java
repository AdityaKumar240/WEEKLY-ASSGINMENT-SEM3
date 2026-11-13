package control_flow.assigment_problems;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    void sumOfNaturalNumbers(int n) {
        int i = 1, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new SumOfNaturalNumbers().sumOfNaturalNumbers(n);
    }
}
