package abstraction_interface.assigment_problems;
import java.util.*;
abstract class Cab {
    abstract double rate();
    double fare(double km) { return Math.max(100, km * rate()); }
}
interface NightService {
    double nightFare(double fare);
}
class MiniCab extends Cab {
    double rate() { return 10; }
}
class SedanCab extends Cab implements NightService {
    double rate() { return 14; }
    public double nightFare(double fare) { return fare * 1.20; }
}
class SuvCab extends Cab implements NightService {
    double rate() { return 18; }
    public double nightFare(double fare) { return fare * 1.20; }
}
public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double km = sc.nextDouble();
            String time = sc.next().toUpperCase();
            Cab c;
            switch (type) {
                case "MINI": c = new MiniCab(); break;
                case "SEDAN": c = new SedanCab(); break;
                case "SUV": c = new SuvCab(); break;
                default: continue;
            }
            if (time.equals("NIGHT") && !(c instanceof NightService)) {
                System.out.println(type + ": night service not available");
                continue;
            }
            double fare = c.fare(km);
            if (time.equals("NIGHT")) fare = ((NightService)c).nightFare(fare);
            System.out.printf(Locale.US, "%s: %.2f%n", type, fare);
            total += fare;
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}