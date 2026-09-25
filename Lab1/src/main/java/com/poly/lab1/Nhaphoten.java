package com.poly.lab1;
import java.util.Scanner;
public class Nhaphoten{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ten;
        int namSinh;
        System.out.println("Nhap ho va ten");
        ten=sc.nextLine();
        System.out.println("Nhap nam sinh");
        namSinh=sc.nextInt();
        System.out.printf("Ho va ten: %s\nNam Sinh:%d\nTuoi:%d\n",ten,namSinh,2026-namSinh);
        
    }
}