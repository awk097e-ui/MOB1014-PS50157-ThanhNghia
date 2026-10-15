package com.poly.lab5;

import java.util.Scanner;

public class Laptop {

    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

    public Laptop() {
    }

    public Laptop(String id, String name, String type,
                  double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("So luong khong hop le");
        }
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ID: ");
        id = sc.nextLine();

        System.out.print("Nhap ten: ");
        name = sc.nextLine();

        System.out.print("Nhap loai: ");
        type = sc.nextLine();

        System.out.print("Nhap gia: ");
        setPrice(Double.parseDouble(sc.nextLine()));

        System.out.print("Nhap so luong: ");
        setQuantity(Integer.parseInt(sc.nextLine()));
    }

    public void output() {
        System.out.printf(
            "ID: %s | Ten: %s | Loai: %s | Gia: %.0f | SL: %d%n",
            id, name, type, price, quantity
        );
    }
}