package com.shivansh.dependency_inversion_principle;

public class ShoppingCart {
    private final IPaymentProcessor paymentProcessor;

    // Constructor injection for dependency
    public ShoppingCart(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        paymentProcessor.processPayment(amount);
    }
}