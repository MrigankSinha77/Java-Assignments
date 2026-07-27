import java.util.Scanner;

public class unboxing_auto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        String first = input.nextLine();

        System.out.print("Enter Number 2: ");
        String second = input.nextLine();

        // Convert String into int
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);

        System.out.println("\nEntered Values");
        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;

        System.out.println("\nResults");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double quotient = (double) number1 / number2;
            int remainder = number1 % number2;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }

        // Autoboxing Example
        int primitiveNum = 75;
        Integer objectNum = primitiveNum;

        System.out.println("\nAutoboxing Example");
        System.out.println("Primitive : " + primitiveNum);
        System.out.println("Wrapper   : " + objectNum);

        // Unboxing Example
        Integer anotherObject = 500;
        int anotherPrimitive = anotherObject;

        System.out.println("\nUnboxing Example");
        System.out.println("Wrapper   : " + anotherObject);
        System.out.println("Primitive : " + anotherPrimitive);

        input.close();
    }
}