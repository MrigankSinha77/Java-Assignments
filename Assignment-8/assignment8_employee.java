class Employee {
    String name = "Mrigank";
    int salary = 7700000;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    void displayManager() {
        System.out.println("Manager accessing Employee details:");
        System.out.println("Employee Name: " + super.name);
        System.out.println("Salary: " + super.salary);
    }
}

public class assignment8_employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayManager();
    }
}
