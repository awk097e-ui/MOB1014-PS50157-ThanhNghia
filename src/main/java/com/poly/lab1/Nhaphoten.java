package com.poly.lab1;
import java.util.Scanner;
public class Nhaphoten{
    public static void main (String[]args){
        String ten;
        int namSinh;
        Scanner sc=new Scanner (System.in);
        System.out.print("Nhap Ho Ten :");
        ten = sc.nextLine();
        System.out.print("Nhap nam sinh");
        namSinh=sc.nextInt();
        System.out.printf("Ho va ten %s\nNam Sinh :%d\nTuoi%d\n",ten,namSinh,2026-namSinh);
    }
    
}
