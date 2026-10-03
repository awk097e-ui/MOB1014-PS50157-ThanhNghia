package com.poly.lab2;
import java.util.Scanner;


public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a,b,ketQua;
        char op;
        System.out.println("Nhap a:");
        a=sc.nextDouble();
        System.out.println("Nhap b:");
        b=sc.nextDouble();
        System.out.println("Nhap phep toan (+,-,*,/:)");
        op=sc.next().charAt(0);
        switch(op){
            case '+':
         ketQua=a+b;
                System.out.printf("Ket qua:%.2f\n",ketQua);
                break;
            case '-':
                    ketQua=a-b;
                           System.out.printf("Ket Qua :%.2f\n",ketQua);
                           break;
            case '*':
               ketQua=a*b;
                System.out.printf("Ket Qua:%.2f\n",ketQua);
                break;
            case '/':
                if(b==0){System.out.println("Khong The chia cho 0");
                }else {ketQua=a/b;
                    System.out.printf("Ket qua : %.2f\n",ketQua);
                }
                break;
            default:
                System.out.println("Phep toan ko hop le");
                }
                                    
        }
    }
    
