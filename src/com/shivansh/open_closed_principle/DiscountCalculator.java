package com.shivansh.open_closed_principle;

public class DiscountCalculator {
    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDiscount(double amount) {
        return strategy.calculateDiscount(amount);
    }
}
