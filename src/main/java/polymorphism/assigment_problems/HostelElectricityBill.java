package polymorphism.assigment_problems;
import java.util.*;
abstract class Room {
    abstract double bill(int units);
}
class SingleRoom extends Room {
    double bill(int units) { return units * 8.0; }
}
class SharedRoom extends Room {
    int occupants;
    SharedRoom(int occupants) { this.occupants = occupants; }
    double bill(int units) { return units * 6.0 / occupants; }
}
class AcRoom extends Room {
    double bill(int units) { return units * 10.0 + 200; }
}
public class HostelElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            int units = sc.nextInt();
            Room r;
            switch (type) {
                case "SINGLE": r = new SingleRoom(); break;
                case "SHARED": r = new SharedRoom(sc.nextInt()); break;
                case "AC": r = new AcRoom(); break;
                default: continue;
            }
            double bill = r.bill(units);
            System.out.printf(Locale.US, "%s: %.2f%n", type, bill);
            total += bill;
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}