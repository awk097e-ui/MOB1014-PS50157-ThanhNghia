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
        System.out.println("Nhap Thang");
        thang = sc . nextInt();
        switch(thang){
            case 1,2,3:
                System.out.println("Thang"+thang+"Mua Xuan");
                break;
            case 4,5,6:
                System.out.println("Thang"+thang+"Mua He");
                break;
            case 7,8,9:
                System.out.println("Thang"+thang+"Mua Thu");
                break;
            case 10,11,12:
                System.out.println("Thang"+thang+"Mua Dong");
                break;
            default:
                System.out.println("Thang Khong Hop Le");
                
        }
        }
    }
    


