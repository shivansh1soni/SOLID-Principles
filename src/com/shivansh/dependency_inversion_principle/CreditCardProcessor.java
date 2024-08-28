package com.shivansh.dependency_inversion_principle;

public class CreditCardProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card.");
    }
}