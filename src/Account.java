public abstract class Account {
    private String accountNumber;
    private double balance;

    protected Account (String accountNumber,double balance) {
        if(balance<0) {
            throw new IllegalArgumentException("Initial Balance can't be negative. You Entered: $" + balance);
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public abstract double calculateInterest();

    protected String getAccountNumber(){
        return accountNumber;
    }
    protected double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayInfo(){
        System.out.println("AccountNumber: "+accountNumber + "\nBalance: "+balance);
    }
}