package com.harsha.demo3.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    //field injection
//    @Autowired
    PaymentService paymentService;

    //constructor injection
    //Note: When we are doing the constructor injection we need not write the auto wired. we can also write the autowired that's our wish.

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //setter injection
//    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.payment();
        System.out.println("Order placed");
    }
}
