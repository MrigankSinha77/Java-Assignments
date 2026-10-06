class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        double interest = balance * 0.04;
        if (balance > 50000) {
            interest += 500;
        }
        return interest;
    }
}

class FixedDeposit extends SavingsAccount {

    FixedDeposit(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return super.calculateInterest() + balance * 0.02;
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(10000);
        SavingsAccount s2 = new SavingsAccount(60000);
        FixedDeposit f1 = new FixedDeposit(60000);

        System.out.println("TC 1: " + s1.calculateInterest());
        System.out.println("TC 2: " + s2.calculateInterest());
        System.out.println("TC 3: " + f1.calculateInterest());

        Account acc = new FixedDeposit(60000);
        System.out.println("Polymorphism: " + acc.calculateInterest());
    }
}
