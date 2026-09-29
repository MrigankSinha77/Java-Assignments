class BankAccount {
    final int accountNumber = 7012077;
    String holderName = "Mrigank";
    double balance = 77390.619;

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

public class assignment9_bank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.displayAccount();
    }
}
