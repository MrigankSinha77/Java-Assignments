class Calculator {

    int x;
    int y;
    int z;
    static int objectCount = 0;

    // Default Constructor
    Calculator() {
        x = 35;
        y = 42;
        z = 0;
        objectCount++;
    }

    // Constructor with two parameters
    Calculator(int num1, int num2) {
        x = num1;
        y = num2;
        z = 0;
        objectCount++;
    }

    // Constructor with three parameters
    Calculator(int num1, int num2, int num3) {
        x = num1;
        y = num2;
        z = num3;
        objectCount++;
    }

    void displaySum() {
        int total = x + y + z;
        System.out.println("Total = " + total);
    }

    static void showObjects() {
        System.out.println("Objects Created : " + objectCount);
    }
}

public class assignment3_overloading {

    public static void main(String[] args) {

        System.out.println("Default Constructor");
        Calculator c1 = new Calculator();
        c1.displaySum();

        System.out.println();

        System.out.println("Two-Parameter Constructor");
        Calculator c2 = new Calculator(70, 7);
        c2.displaySum();

        System.out.println();

        System.out.println("Three-Parameter Constructor");
        Calculator c3 = new Calculator(7, 30, 40);
        c3.displaySum();

        System.out.println();

        Calculator.showObjects();
    }
}
