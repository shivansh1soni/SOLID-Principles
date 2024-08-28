package com.shivansh.open_closed_principle;

public class UseCalculator {
    public static void main(String[] args) {
        DiscountStrategy regular = new RegularDiscount();
        DiscountStrategy vip = new VipDiscount();

        DiscountCalculator regularCalculator = new DiscountCalculator(regular);
        System.out.println("Regular discount: " + regularCalculator.calculateDiscount(100));

        DiscountCalculator vipCalculator = new DiscountCalculator(vip);
        System.out.println("Regular discount: " + vipCalculator.calculateDiscount(100));

    }
}
