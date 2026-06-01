public class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("S-93849739", 20000, "Solo");
        CurrentAccount current = new CurrentAccount("C-35323344", 10000, "Leveling");

        System.out.println("Runtime Polymorphism: ");
        Account[] accounts = {savings, current};
        for (Account account : accounts) {
            account.displayInfo();
            System.out.println("Calculated Interest: $" + String.format("%.2f", account.calculateInterest()));
        }

        System.out.println("\nDeposit Sample:  ");
        BankAccount bankAccount = new BankAccount("B-4487498", 750, "Arise");
        bankAccount.deposit(2470);
        bankAccount.deposit(500.50);

        System.out.println("\nWithdraw Sample:   ");
        try {
            bankAccount.withdraw(3000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Current Balance: $" + String.format("%.2f", bankAccount.getBalance()));
        }

        System.out.println("\nMulti-Catch Block Sample:   ");
        try {
            bankAccount.withdraw(-300);
        } catch (InsufficientFundsException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Balance after transaction: $" + String.format("%.2f", bankAccount.getBalance()));
        }
    }
}