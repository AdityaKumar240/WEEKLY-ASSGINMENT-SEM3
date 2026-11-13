package abstraction_interface.assigment_problems;
import java.util.*;
abstract class CollegeStudent {
    String name;
    CollegeStudent(String name) { this.name = name; }
    abstract double tuition();
    double hostelFee() { return 0; }
    double totalFee() { return tuition() + hostelFee() + (this instanceof BusUser ? BusUser.TRANSPORT_FEE : 0); }
}
interface BusUser {
    double TRANSPORT_FEE = 12000;
}
class DayScholar extends CollegeStudent implements BusUser {
    DayScholar(String n) { super(n); }
    double tuition() { return 40000; }
}
class Hosteller extends CollegeStudent {
    Hosteller(String n) { super(n); }
    double tuition() { return 40000; }
    double hostelFee() { return 60000; }
}
class ScholarshipStudent extends CollegeStudent implements BusUser {
    ScholarshipStudent(String n) { super(n); }
    double tuition() { return 20000; }
}
public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            String name = sc.next();
            CollegeStudent s;
            switch (type) {
                case "DAY_SCHOLAR": s = new DayScholar(name); break;
                case "HOSTELLER": s = new Hosteller(name); break;
                case "SCHOLAR": s = new ScholarshipStudent(name); break;
                default: continue;
            }
            double fee = s.totalFee();
            System.out.printf(Locale.US, "%s: %.2f%n", name, fee);
            total += fee;
        }
        System.out.printf(Locale.US, "Total Collected: %.2f%n", total);
    }
}