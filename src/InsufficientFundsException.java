public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(double amount, double balance) {
        super("Cannot withdraw $" + String.format("%.2f", amount) + ". Available balance is only $" + String.format("%.2f", balance) + ".");
    }
}
