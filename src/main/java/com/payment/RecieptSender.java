package com.payment;

import com.google.common.eventbus.Subscribe;


public class RecieptSender {

    @Subscribe
    public  void sendRecieptToCustomer(PaymentSuccessfulEvent paymentSuccessfulEvent){
        // Simulate sending reciept
        System.out.println("Reciept sent to Customer");       
    }
    
    @Subscribe
    public  void sendRecieptToSeller(PaymentSuccessfulEvent paymentSuccessfulEvent){
        // Simulate sending reciept
        System.out.println("Reciept sent to Seller");       
    }
}