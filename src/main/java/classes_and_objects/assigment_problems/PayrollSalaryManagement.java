package classes_and_objects.assigment_problems;
public class PayrollSalaryManagement {
    static class PayrollAccount {
        private double basicSalary, bonus;
        public PayrollAccount(double basicSalary) {
            if (basicSalary < 0) {
                System.out.println("Invalid salary. Starting at 0.");
                basicSalary = 0;
            }
            this.basicSalary = basicSalary;
        }
        public void creditBonus(double amount) {
            if (amount <= 0) System.out.println("Bonus must be positive");
            else { bonus += amount; System.out.println("Bonus credited: Rs " + amount); }
        }
        public void deductTax(double percent) {
            if (percent < 0 || percent > 100) System.out.println("Invalid tax percentage");
            else {
                basicSalary -= basicSalary * percent / 100;
                System.out.println("Tax deducted: " + percent + "%");
            }
        }
        public double getNetSalary() { return basicSalary + bonus; }
    }
    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}