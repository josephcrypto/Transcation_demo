package cn.coding.com.transaction_demo.exception;

public class InsufficientAmountException extends RuntimeException{

    public InsufficientAmountException(String msg) {
        super(msg);
    }
}
