package classes_and_objects.assigment_problems;
public class EmployeeCompanyInformation {
    static class Employee {
        String empName;
        double salary;
        static String companyName = "Bright Horizon Technologies";
        static int employeeCount = 0;
        Employee(String empName, double salary) {
            this.empName = empName; this.salary = salary; employeeCount++;
        }
        static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }
    public static void main(String[] args) {
        new Employee("A", 30000);
        new Employee("B", 40000);
        new Employee("C", 50000);
        Employee.printCompanyInfo();
    }
}