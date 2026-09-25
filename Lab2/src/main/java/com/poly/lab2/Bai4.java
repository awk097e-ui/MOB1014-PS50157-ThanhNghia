package com.poly.lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, ketQua;
        char op;

        System.out.print("Nhap so a: ");
        a = sc.nextDouble();

        System.out.print("Nhap phep toan (+, -, *, /): ");
        op = sc.next().charAt(0);

        System.out.print("Nhap so b: ");
        b = sc.nextDouble();

        switch (op) {

            case '+':
                ketQua = a + b;
                System.out.printf("Ket qua: %.2f%n", ketQua);
                break;

            case '-':
                ketQua = a - b;
                System.out.printf("Ket qua: %.2f%n", ketQua);
                break;

            case '*':
                ketQua = a * b;
                System.out.printf("Ket qua: %.2f%n", ketQua);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    ketQua = a / b;
                    System.out.printf("Ket qua: %.2f%n", ketQua);
                }
                break;

            default:
                System.out.println("Phep toan khong hop le");
        }
    }
}