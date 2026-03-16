package L04_Error_Handling;

public class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}