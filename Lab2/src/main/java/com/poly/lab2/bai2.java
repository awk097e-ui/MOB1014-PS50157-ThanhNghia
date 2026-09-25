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
public class bai2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
     double toan,ly,hoa,dtb;
        System.out.println("Nhap Diem Toan:");
        toan=sc.nextDouble();
        System.out.println("Nhap Diem Ly:");
        ly=sc.nextDouble();
        System.out.println("Nhap Diem Hoa:");
        hoa=sc.nextDouble();
        if(toan<0||toan>10
                ||ly<0||ly>10
                ||hoa<0||hoa>10){System.out.println("Diem Khong Hop Le");return;}
        dtb=(toan*2+ly+hoa)/4;
        if(dtb>=8){System.out.println("Xep Loai Gioi");
        }
        else if(dtb>=6.5){System.out.println("Xep loai kha");}
        else if (dtb>=5){System.out.println("Xep Loai Trung BInh");}
        else {System.out.println("Xep Loai Yeu");}
        System.out.printf("Diem Trung Binh:%.2f\n",dtb);
        }
        
        
        }
                

        
        
        
            
        
        
    
    

