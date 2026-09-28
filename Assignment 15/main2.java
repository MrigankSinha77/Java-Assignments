import java.util.Scanner;

class ATMVerification {

    static void verifyPIN(int pin) throws Exception {
        int correctPIN = 1234;

        if (pin != correctPIN) {
            throw new Exception("Invalid PIN");
        }

        System.out.println("PIN Verified Successfully");
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        try {
            verifyPIN(pin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("PIN verification process completed.");
        }

        sc.close();
    }
}
