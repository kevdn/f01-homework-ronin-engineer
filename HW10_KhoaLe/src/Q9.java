import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

class BankAccount {
    private double balance = 0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientResourcesException {
        if (balance < amount) {
            throw new InsufficientResourcesException();
        }

        balance -= amount;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        deposit(depositAmount);
        System.out.println("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        try {
            withdraw(withdrawAmount);
            System.out.println("Withdraw successful");
        } catch (InsufficientResourcesException e) {
            System.err.println("Insufficient resources to withdraw: " + e.getMessage());
        }
        System.out.println("Current balance: " + getBalance());
    }
}

public class Q9 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.run();
    }
}
