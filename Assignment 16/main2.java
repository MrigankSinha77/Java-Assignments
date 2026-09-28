import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class DrivingLicenseSystem {

    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18. Not eligible for a driving license.");
        }

        System.out.println("You are eligible for a driving license.");
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
