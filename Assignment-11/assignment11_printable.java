interface Printable {
    void printDetails();
}

class Student implements Printable {
    public void printDetails() {
        System.out.println("Student Name: Rahul");
        System.out.println("Roll No: 101");
    }
}

class Employee implements Printable {
    public void printDetails() {
        System.out.println("Employee Name: Amit");
        System.out.println("Employee ID: 201");
    }
}

public class assignment11_printable {
    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();

        s.printDetails();
        e.printDetails();
    }
}
