package exception;

public class TransactionNotUnique extends RuntimeException {
    public TransactionNotUnique(String message) {
        super(message);
    }

}