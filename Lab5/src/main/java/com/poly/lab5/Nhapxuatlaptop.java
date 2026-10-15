package com.poly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nhapxuatlaptop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        String tiepTuc;

        do {
            Laptop laptop = new Laptop();
            laptop.input(sc);
            list.add(laptop);

            System.out.print("Tiep tuc nhap? (y/n): ");
            tiepTuc = sc.nextLine();

        } while (tiepTuc.equalsIgnoreCase("y"));

        System.out.println(
            "=== DANH SACH LAPTOP (" + list.size() + " may) ==="
        );

        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}