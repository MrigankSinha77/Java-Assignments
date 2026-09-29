class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + baseSalary * 0.05;
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return super.calculateSalary() + 2000;
    }
}

class Executive extends Manager {

    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return super.calculateSalary() + baseSalary * 0.10;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 10000);
        Manager m1 = new Manager("Bob", 10000);
        Executive x1 = new Executive("Charlie", 10000);

        System.out.printf("TC 1: %.2f%n", e1.calculateSalary());
        System.out.printf("TC 2: %.2f%n", m1.calculateSalary());
        System.out.printf("TC 3: %.2f%n", x1.calculateSalary());

        Employee e = new Executive("Charlie", 10000);
        System.out.printf("Upcasting: %.2f%n", e.calculateSalary());
    }
}
