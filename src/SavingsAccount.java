public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber,double balance, String holderName) {
        super(accountNumber, balance, holderName);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nSavings Account: ");
        super.displayInfo();
        System.out.println("Interest: " + calculateInterest());
    }
}