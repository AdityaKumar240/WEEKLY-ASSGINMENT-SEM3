package abstraction_interface.assigment_problems;
import java.util.*;
abstract class Ticket {
    static final double CONVENIENCE_FEE = 20;
    int count;
    Ticket(int count) { this.count = count; }
    abstract double seatPrice();
    double amount() { return count * (seatPrice() + CONVENIENCE_FEE); }
}
class RegularTicket extends Ticket {
    RegularTicket(int n) { super(n); }
    double seatPrice() { return 150; }
}
class PremiumTicket extends Ticket {
    PremiumTicket(int n) { super(n); }
    double seatPrice() { return 250; }
}
class ReclinerTicket extends Ticket {
    ReclinerTicket(int n) { super(n); }
    double seatPrice() { return 400; }
}
public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String seat = sc.next().toUpperCase();
            int count = sc.nextInt();
            Ticket t;
            switch (seat) {
                case "REGULAR": t = new RegularTicket(count); break;
                case "PREMIUM": t = new PremiumTicket(count); break;
                case "RECLINER": t = new ReclinerTicket(count); break;
                default: continue;
            }
            double amount = t.amount();
            System.out.printf(Locale.US, "%s: %.2f%n", seat, amount);
            total += amount;
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}