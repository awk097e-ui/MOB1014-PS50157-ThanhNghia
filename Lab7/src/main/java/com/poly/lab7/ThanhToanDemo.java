
package com.poly.lab7;

import java.util.ArrayList;
import java.util.List;

public class ThanhToanDemo {

    public static void main(String[] args) {

        double[] donHang = {100000, 250000, 1000000};

        List<Payment> methods = new ArrayList<>();
        methods.add(new CashPayment());
        methods.add(new CardPayment());

        for (double amount : donHang) {
            double cash = methods.get(0).pay(amount);
            double card = methods.get(1).pay(amount);

            System.out.printf(
                "Don hang %.0f: Tien mat = %.0f | The = %.0f%n",
                amount, cash, card
            );
        }
    }
}
