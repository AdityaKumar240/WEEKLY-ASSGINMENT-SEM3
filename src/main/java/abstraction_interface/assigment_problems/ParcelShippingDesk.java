package abstraction_interface.assigment_problems;
import java.util.*;
abstract class Parcel {
    double weight, value;
    Parcel(double weight, double value) { this.weight = weight; this.value = value; }
    abstract double shippingCharge();
}
interface Insurable {
    double insurance();
}
class StandardParcel extends Parcel {
    StandardParcel(double w, double v) { super(w, v); }
    double shippingCharge() { return 40 + 10 * weight; }
}
class ExpressParcel extends Parcel implements Insurable {
    ExpressParcel(double w, double v) { super(w, v); }
    double shippingCharge() { return 80 + 15 * weight; }
    public double insurance() { return value * 0.02; }
}
class FragileParcel extends Parcel implements Insurable {
    FragileParcel(double w, double v) { super(w, v); }
    double shippingCharge() { return 40 + 10 * weight + 50; }
    public double insurance() { return value * 0.02; }
}
public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grand = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double weight = sc.nextDouble(), value = sc.nextDouble();
            Parcel p;
            switch (type) {
                case "STANDARD": p = new StandardParcel(weight, value); break;
                case "EXPRESS": p = new ExpressParcel(weight, value); break;
                case "FRAGILE": p = new FragileParcel(weight, value); break;
                default: continue;
            }
            double charge = p.shippingCharge();
            double insurance = p instanceof Insurable ? ((Insurable)p).insurance() : 0;
            double total = charge + insurance;
            System.out.printf(Locale.US, "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n", type, charge, insurance, total);
            grand += total;
        }
        System.out.printf(Locale.US, "Grand Total: %.2f%n", grand);
    }
}