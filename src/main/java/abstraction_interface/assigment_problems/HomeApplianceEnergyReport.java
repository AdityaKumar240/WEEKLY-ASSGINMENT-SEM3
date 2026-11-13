package abstraction_interface.assigment_problems;
import java.util.*;
abstract class Appliance {
    abstract double power();
    double units(double hours) { return power() * hours / 1000.0; }
}
interface SaverMode {
    double SAVER_FACTOR = 0.75;
}
class Fridge extends Appliance {
    double power() { return 150; }
}
class AirConditioner extends Appliance implements SaverMode {
    double power() { return 1500; }
}
class Television extends Appliance {
    double power() { return 100; }
}
class WashingMachine extends Appliance implements SaverMode {
    double power() { return 500; }
}
public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double hours = sc.nextDouble();
            boolean saver = sc.hasNext() && sc.hasNext("SAVER");
            if (saver) sc.next();
            Appliance a;
            switch (type) {
                case "FRIDGE": a = new Fridge(); break;
                case "AC": a = new AirConditioner(); break;
                case "TV": a = new Television(); break;
                case "WASHER": a = new WashingMachine(); break;
                default: continue;
            }
            if (saver && !(a instanceof SaverMode)) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }
            double units = a.units(hours);
            if (saver) units *= SaverMode.SAVER_FACTOR;
            double cost = units * 8;
            System.out.printf(Locale.US, "%s: Units=%.2f Cost=%.2f%n", type, units, cost);
            total += cost;
        }
        System.out.printf(Locale.US, "Total Cost: %.2f%n", total);
    }
}