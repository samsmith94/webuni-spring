package hu.webuni.spring.hr.exception;

public class NoDataFoundException extends RuntimeException {

    public NoDataFoundException() {
        super("No data found.");
    }
}
