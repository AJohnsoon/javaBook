package chapter15.common.exceptions;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
