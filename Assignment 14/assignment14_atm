import java.util.Scanner;

public class assignment14_atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        try {
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount <= 0 || amount > balance) {
                throw new Exception();
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (Exception e) {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
