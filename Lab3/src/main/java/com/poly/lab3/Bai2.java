package com.poly.lab3;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      int so;
      int dem=0;
      do{System.out.println("Nhap so :");
      so= sc.nextInt();
      dem++;
      if(so<=0||so%3!=0||so%5!=0)
              System.out.println("So khong hop le,moi nhap lai");
      }while(so<=0||so%3!=0||so%5!=0);
        System.out.println("So hop le:" +so +"(sau" + dem + "lan nhap)");
    }
}