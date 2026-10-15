package com.poly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Timkiemlaptop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        System.out.print("Nhap gia min: ");
        double min = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap gia max: ");
        double max = Double.parseDouble(sc.nextLine());

        if (min > max) {
            System.out.println("Khoang gia khong hop le");
        } else {
            System.out.println(
                "=== LAPTOP GIA TU " + min + " DEN " + max + " ==="
            );

            boolean timThay = false;

            for (Laptop laptop : list) {
                if (laptop.getPrice() >= min
                        && laptop.getPrice() <= max) {
                    laptop.output();
                    timThay = true;
                }
            }

            if (!timThay) {
                System.out.println("Khong tim thay laptop nao");
            }
        }

        System.out.print("Nhap tu khoa: ");
        String keyword = sc.nextLine();

        System.out.println(
            "=== KET QUA TIM KIEM \"" + keyword + "\" ==="
        );

        boolean timThay = false;

        for (Laptop laptop : list) {
            if (laptop.getId().equalsIgnoreCase(keyword)
                    || laptop.getName().toLowerCase()
                    .contains(keyword.toLowerCase())) {
                laptop.output();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay laptop nao");
        }
    }
}