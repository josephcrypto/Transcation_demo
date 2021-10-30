package cn.coding.com.transaction_demo.utils;

import cn.coding.com.transaction_demo.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("account1", 13000.00);
        paymentMap.put("account2", 10000.00);
        paymentMap.put("account3", 5000.00);
        paymentMap.put("account4", 9000.00);
    }

    public static boolean validateCreditLimit(String accountNo, double paidAmount) {
        if (paidAmount > paymentMap.get(accountNo)) {
            throw new InsufficientAmountException("Insufficient Fund...!!");
        } else {
            return true;
        }
    }

}
