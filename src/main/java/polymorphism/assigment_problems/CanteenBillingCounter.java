package polymorphism.assigment_problems;
import java.util.*;
abstract class Customer {
    abstract double finalAmount(double amount);
}
class StudentCustomer extends Customer {
    double finalAmount(double amount) { return amount * 0.90; }
}
class StaffCustomer extends Customer {
    double finalAmount(double amount) { return amount * 0.95; }
}
class GuestCustomer extends Customer {
    double finalAmount(double amount) { return amount + 10; }
}
public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double amount = sc.nextDouble();
            Customer c;
            switch (type) {
                case "STUDENT": c = new StudentCustomer(); break;
                case "STAFF": c = new StaffCustomer(); break;
                case "GUEST": c = new GuestCustomer(); break;
                default: continue;
            }
            double bill = c.finalAmount(amount);
            System.out.printf(Locale.US, "%s: %.2f%n", type, bill);
            total += bill;
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}