
package com.poly.lab2;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap Thang:");
        int thang =sc.nextInt();
        switch (thang){
            case 1 , 2 ,3 :
                System.out.println("Thang "+ thang +" Mua Xuan");
                break;
            case 4,5,6:
                System.out.println("Thang "+thang+" Mua ha");
                break;
            case 7,8,9:
                System.out.println("Thang "+thang+" Mua Thu");
                break;
            case 10,11,12:
                System.out.println("Thang "+thang+" Mua dong");
                break;
            default:
                System.out.println("Thang Khong Hop Le");
                
        }
    }
    }
    


