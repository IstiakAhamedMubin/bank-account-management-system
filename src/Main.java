import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--------$ Bank Account Management System $--------");

        System.out.print("Enter Savings Account Number: ");
        String savingsAccNo = input.nextLine();

        System.out.print("Enter Savings Account Holder Name: ");
        String savingsHolder = input.nextLine();

        System.out.print("Enter Savings Account Initial Balance: ");
        double savingsBalance = input.nextDouble();
        input.nextLine();

        System.out.print("\nEnter Current Account Number: ");
        String currentAccNo = input.nextLine();

        System.out.print("Enter Current Account Holder Name: ");
        String currentHolder = input.nextLine();

        System.out.print("Enter Current Account Initial Balance: ");
        double currentBalance = input.nextDouble();

        SavingsAccount savings = new SavingsAccount(savingsAccNo, savingsBalance, savingsHolder);

        CurrentAccount current = new CurrentAccount(currentAccNo, currentBalance, currentHolder);

        System.out.println("\n-----Runtime Polymorphism----");

        Account[] accounts = {savings, current};

        for (Account account : accounts) {
            account.displayInfo();
            System.out.println("Calculated Interest: $" + String.format("%.2f", account.calculateInterest()));
        }
        System.out.println("\n------Compile-Time Polymorphism------");

        BankAccount bankAccount = new BankAccount("BD-999", 1000, "Bangladeshi Dealer");

        bankAccount.deposit(500);
        bankAccount.deposit(250.75);

        System.out.println("\n----Exception Handling-----");

        System.out.print("Enter Withdrawal Amount: ");

        try {
            double amount = input.nextDouble();
            bankAccount.withdraw(amount);

        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Current Balance: $" + String.format("%.2f", bankAccount.getBalance()));
        }

        System.out.println("\n-----Multi-Catch Example-----");

        try {
            System.out.print("Enter Another Withdrawal Amount: ");
            double amount = input.nextDouble();
            bankAccount.withdraw(amount);

        } catch (InsufficientFundsException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Balance After Transaction: $" + String.format("%.2f", bankAccount.getBalance()));
        }
        input.close();
    }
}