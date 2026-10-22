
package com.poly.lab7;

public class CardPayment implements Payment {

    @Override
    public double pay(double amount) {
        double discountedAmount = amount * 0.95;
        return discountedAmount + discountedAmount * TAX;
    }
}
