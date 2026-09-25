/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Test {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap A:");
        double a =sc.nextDouble();
        System.out.print("Nhap B:");
        double b = sc.nextDouble();
        System.out.println("===== MAY TINH =====");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Nhap lua chon: ");
        int luaChon;
        luaChon=sc.nextInt();
        double ketQua;
        switch (luaChon){
            case 1:
                 ketQua=a+b;
                System.out.println("Ket Qua a + b :"+ketQua);
                break;
            case 2:
                ketQua=a-b;
                System.out.println("Ket qua a - b ="+ketQua);
                break ;
            case 3:
                ketQua = a*b;
                System.out.println("Ket qua a*b="+ketQua);
                break;
                        
            case 4:
                if (b==0){
                    System.out.print("Khong The Chia");
                }else{
                    ketQua = a/b;
                    System.out.println("ket qua a/b"+ketQua);
                    
                }
                break;
                default :
                System.out.println("sai lua chon");
                    
        }
    }
}
        
