
package com.poly.lab7;

public class CashPayment implements Payment {

    @Override
    public double pay(double amount) {
        return amount + amount * TAX;
    }
}
