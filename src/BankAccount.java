public class  BankAccount extends Account {
    private String holderName;

    public  BankAccount(String accountNumber,double balance,String holderName) {
        super(accountNumber,balance);
        this.holderName = holderName;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName (String holderName) {
        this.holderName = holderName;
    }
    @Override
    public double calculateInterest() {
        return 0.0;
    }
    @Override
    public void displayInfo() {
        System.out.println("Account Holder: "+holderName);
        super.displayInfo();
    }
    public void deposit (int amount){
        if(amount<=0){
            System.out.println("Deposit amount must be positive");
            return;
        }
        setBalance(getBalance()+amount);
        System.out.println("Deposited(int):  $"+amount + "|New Balance: $"+String.format("%.2f",getBalance()));
    }
    public void deposit (double amount) {
        if (amount<=0){
            System.out.println("Deposit amount must be positive");
            return;
        }
        setBalance(getBalance()+amount);
        System.out.println("Deposited(double): $"+String.format("%.2f",amount) + "|New Balance: $"+ String.format("%.2f",getBalance()));
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= 0){
            throw new ArithmeticException("Withdrawal amount must be positive");
        }
        if (amount > getBalance()) {
            throw new InsufficientFundsException(amount,getBalance());
        }
        setBalance(getBalance() - amount);
        System.out.println(amount + " withdrawn.");
    }
}