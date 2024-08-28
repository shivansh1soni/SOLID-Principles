package com.shivansh.dependency_inversion_principle;

public class PayPalProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal.");
    }
}