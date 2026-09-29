import java.util.Scanner;

class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        String basicSalary = sc.nextLine();

        System.out.print("Enter Bonus Amount: ");
        String bonus = sc.nextLine();

        // Convert String to Wrapper Objects
        Integer id = Integer.valueOf(empId);
        Double salary = Double.valueOf(basicSalary);
        Double bonusAmount = Double.valueOf(bonus);

        // Validation
        if (salary < 0 || bonusAmount < 0) {
            System.out.println("Invalid salary or bonus amount.");
        } else {
            double netSalary = salary + bonusAmount;

            System.out.println("\nEmployee Details");
            System.out.println("Employee ID: " + id);
            System.out.println("Basic Salary: " + salary);
            System.out.println("Bonus: " + bonusAmount);
            System.out.println("Net Salary: " + netSalary);
        }

        sc.close();
    }
}
