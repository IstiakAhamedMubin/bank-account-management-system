public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double balance, String holderName) {
        super(accountNumber, balance, holderName);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void displayInfo() {

        System.out.println("\nCurrent Account: ");
        super.displayInfo();
        System.out.println("Interest: "+ calculateInterest());
    }
}