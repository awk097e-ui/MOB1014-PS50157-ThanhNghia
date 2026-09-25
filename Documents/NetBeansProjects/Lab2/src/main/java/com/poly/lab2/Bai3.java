/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
     int thang;
        System.out.println("Nhap Thang:");
        thang = sc.nextInt();
        switch(thang){
            case 1:
            case 2:
            case 3:
                System.out.println("Thang"+thang+"Mua Xuan");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Thang"+thang+"Mua Ha");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Thang"+thang+"Mua Thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Thang"+thang+"Mua Dong");
                break;
        
        default:
        System.out.println("Thang khong hop le");
        }  
        }
    }
    


