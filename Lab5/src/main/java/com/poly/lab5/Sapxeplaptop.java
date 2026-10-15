package com.poly.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sapxeplaptop {

    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        // Sap xep ten tang dan bang Bubble Sort
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).getName()
                        .compareToIgnoreCase(list.get(j + 1).getName()) > 0) {

                    Laptop temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("=== SAP XEP THEO TEN (A-Z) ===");

        for (Laptop laptop : list) {
            laptop.output();
        }

        // Sap xep gia tang dan
        Collections.sort(list, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop a, Laptop b) {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        });

        // Dao nguoc thanh gia giam dan
        Collections.reverse(list);

        System.out.println("=== SAP XEP THEO GIA GIAM DAN ===");

        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}