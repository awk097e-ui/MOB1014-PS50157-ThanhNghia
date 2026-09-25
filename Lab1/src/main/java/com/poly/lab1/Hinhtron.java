package com.poly.lab1;
import java.util.Scanner;
public class Hinhtron{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        final Double PI = 3.14159;
        double r,cv,dt;
        System.out.println("Nhap ban kinh");
        r=sc.nextDouble();
        cv=r*2*PI;
        dt=r*r*PI;
      System.out.printf("Ban kinh : %.2f\nChu Vi : %.2f\n Dien Tich : %.2f\n ",r,cv,dt);
    }
}