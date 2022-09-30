package com.springboot.tutorial.utils;

import com.springboot.tutorial.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arlund
 */
public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    {
        paymentMap.put("account1", 10000.0);
        paymentMap.put("account2", 40000.0);
        paymentMap.put("account3", 12309.0);
        paymentMap.put("account4", 43157.0);
    }

    public static boolean validateCreditLimit(String accountNo, double paidAmount){
        if(paidAmount > paymentMap.get(accountNo)){
            throw new InsufficientAmountException("insufficient fund!");
        } else {
            return true;
        }
    }
}
