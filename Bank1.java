import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
}

public class Bank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance for Savings Account: ");
        double initialBalance = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(initialBalance);

        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        sa.deposit(depositAmt);

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        sa.withdraw(withdrawAmt);

        sc.close();

    }
}
