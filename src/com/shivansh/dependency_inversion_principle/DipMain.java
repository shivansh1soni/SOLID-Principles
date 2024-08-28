package com.shivansh.dependency_inversion_principle;

public class DipMain {
    public static void main(String[] args) {
        IPaymentProcessor paypalProcessor = new PayPalProcessor();
        ShoppingCart cartWithPayPal = new ShoppingCart(paypalProcessor);
        cartWithPayPal.checkout(100);

        IPaymentProcessor creditCardProcessor = new CreditCardProcessor();
        ShoppingCart cartWithCreditCard = new ShoppingCart(creditCardProcessor);
        cartWithCreditCard.checkout(200);
    }
}
