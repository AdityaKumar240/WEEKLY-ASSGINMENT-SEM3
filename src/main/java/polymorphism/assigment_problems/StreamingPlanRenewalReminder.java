package polymorphism.assigment_problems;
import java.util.*;
import java.time.LocalDate;
abstract class StreamingPlan {
    abstract int validityDays();
}
class BasicPlan extends StreamingPlan {
    int validityDays() { return 30; }
}
class StandardPlan extends StreamingPlan {
    int validityDays() { return 90; }
}
class PremiumPlan extends StreamingPlan {
    int validityDays() { return 365; }
}
public class StreamingPlanRenewalReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            String name = sc.next();
            LocalDate start = LocalDate.parse(sc.next());
            StreamingPlan p;
            switch (type) {
                case "BASIC": p = new BasicPlan(); break;
                case "STANDARD": p = new StandardPlan(); break;
                case "PREMIUM": p = new PremiumPlan(); break;
                default: continue;
            }
            System.out.println(name + ": " + start.plusDays(p.validityDays()));
        }
    }
}