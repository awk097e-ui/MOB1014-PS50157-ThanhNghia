package com.poly.lab1;
import java.util.Scanner;
public class Hinhchunhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        double cd,cr,cv,dt;
        System.out.println("Nhap chieu dai");
        cd=sc.nextDouble();
        System.out.println("Nhap chieu rong");
        cr=sc.nextDouble();
        cv=(cd+cr)*2;
        dt=cd*cr;
        System.out.printf("Chieu dai :%.2f\n Chieu ROng : %.2f\nChu Vi :%.2f\nDien Tich:%.2f\n",cd,cr,cv,dt);
               
    }
}