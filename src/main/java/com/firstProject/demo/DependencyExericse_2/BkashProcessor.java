package com.firstProject.demo.DependencyExericse_2;

import org.springframework.stereotype.Component;

@Component
public class BkashProcessor implements PaymentProcessor {
    @Override
    public String processPayment(double amount){
        return "processing "+amount+" via Bkash";
    }
}
