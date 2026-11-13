package polymorphism.assigment_problems;
import java.util.*;
abstract class Vehicle {
    abstract double charge(int hours);
}
class Bike extends Vehicle {
    double charge(int hours) { return hours * 10.0; }
}
class Car extends Vehicle {
    double charge(int hours) { return 30 + (hours - 1) * 20.0; }
}
class Truck extends Vehicle {
    double charge(int hours) { return Math.max(100, hours * 50.0); }
}
public class CampusParkingChargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            int hours = sc.nextInt();
            Vehicle v;
            switch (type) {
                case "BIKE": v = new Bike(); break;
                case "CAR": v = new Car(); break;
                case "TRUCK": v = new Truck(); break;
                default: continue;
            }
            double cost = v.charge(hours);
            System.out.printf(Locale.US, "%s: %.2f%n", type, cost);
            total += cost;
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}