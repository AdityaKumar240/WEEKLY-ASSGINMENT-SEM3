package polymorphism.assigment_problems;
import java.util.*;
abstract class EmployeeBonus {
    String name;
    double salary;
    EmployeeBonus(String name, double salary) { this.name = name; this.salary = salary; }
    abstract double bonus();
}
class FullTimeEmployee extends EmployeeBonus {
    FullTimeEmployee(String n, double s) { super(n, s); }
    double bonus() { return salary * 0.10; }
}
class PartTimeEmployee extends EmployeeBonus {
    PartTimeEmployee(String n, double s) { super(n, s); }
    double bonus() { return salary * 0.05; }
}
class InternEmployee extends EmployeeBonus {
    InternEmployee(String n, double s) { super(n, s); }
    double bonus() { return 2000; }
}
public class FestivalBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            String name = sc.next();
            double salary = sc.nextDouble();
            EmployeeBonus e;
            switch (type) {
                case "FULLTIME": e = new FullTimeEmployee(name, salary); break;
                case "PARTTIME": e = new PartTimeEmployee(name, salary); break;
                case "INTERN": e = new InternEmployee(name, salary); break;
                default: continue;
            }
            double bonus = e.bonus();
            System.out.printf(Locale.US, "%s: %.2f%n", name, bonus);
            total += bonus;
        }
        System.out.printf(Locale.US, "Total Bonus: %.2f%n", total);
    }
}