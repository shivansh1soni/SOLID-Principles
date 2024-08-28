package com.shivansh.open_closed_principle;

public class VipDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }
}
