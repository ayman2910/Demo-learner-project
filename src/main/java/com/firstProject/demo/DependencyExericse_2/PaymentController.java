package com.firstProject.demo.DependencyExericse_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentProcessor bkashPayement;
    private final PaymentProcessor cardPayment;

    public PaymentController(@Qualifier("bkashProcessor") PaymentProcessor bkashPayement,@Qualifier("cardProcessor") PaymentProcessor cardPayment) {
        this.bkashPayement = bkashPayement;
        this.cardPayment = cardPayment;
    }
    @GetMapping("/checkout")
    public String checkOut(@RequestParam("amount")double amount, @RequestParam("type")String type){
        if(type.equals("bkash")){
            return bkashPayement.processPayment(amount);
        }
        return cardPayment.processPayment(amount);
    }
}
