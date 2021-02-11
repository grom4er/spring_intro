package exception;

public class DataProcessException extends RuntimeException {
    public DataProcessException(String msg, Exception e) {
        super(msg, e);
    }

    public DataProcessException(String msg) {
        super(msg);
    }
}
