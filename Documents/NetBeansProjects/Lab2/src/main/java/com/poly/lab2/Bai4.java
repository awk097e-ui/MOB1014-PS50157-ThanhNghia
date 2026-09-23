/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab2;

/**
 *
 * @author HP
 */



import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, ketQua;
        char op;

        System.out.println("Nhap a:");
        a = sc.nextDouble();

        System.out.println("Nhap b:");
        b = sc.nextDouble();

        System.out.println("Nhap phep toan:");
        op = sc.next().charAt(0);

        switch (op) {

            case '+':
                ketQua = a + b;
                System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, ketQua);
                break;

            case '-':
                ketQua = a - b;
                System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, ketQua);
                break;

            case '*':
                ketQua = a * b;
                System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, ketQua);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    ketQua = a / b;
                    System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, ketQua);
                }
                break;

            default:
                System.out.println("Phep toan khong hop le");
        }
    }
}
