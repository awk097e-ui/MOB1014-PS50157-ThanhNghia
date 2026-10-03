
package com.poly.lab4;

import java.util.Scanner;


public class Student {

    public String id;
    public String name;
    public int age;
    public double gpa;

    public void input(Scanner sc) {

        System.out.println("Nhap ID:");
        id = sc.nextLine();

        System.out.println("Nhap Ho Va Ten:");
        name = sc.nextLine();

        System.out.println("Nhap Tuoi:");
        age = sc.nextInt();

        System.out.println("Nhap Diem GPA:");
        gpa = sc.nextDouble();

        sc.nextLine();
    }

    public String rank() {

        if (gpa >= 9.0) {
            return "Excellent";
        } else if (gpa >= 8.0) {
            return "Very Good";
        } else if (gpa >= 6.5) {
            return "Good";
        } else if (gpa >= 5.0) {
            return "Average";
        } else {
            return "Fail";
        }
    }

    public void output() {

        System.out.printf(
            "ID: %s | Ho Ten: %s | Tuoi: %d | GPA: %.2f | Xep Loai: %s%n",
            id, name, age, gpa, rank()
        );
    }
}