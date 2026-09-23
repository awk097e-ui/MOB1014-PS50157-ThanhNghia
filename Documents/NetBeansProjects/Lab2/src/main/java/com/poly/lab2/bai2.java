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
      double toan ,ly,hoa,dtb;
        System.out.println("Nhap diem toan");
        toan = sc.nextDouble();
        System.out.println("nhap diem ly");
        ly=sc.nextDouble();
        System.out.println("Nhap diem hoa:");
        hoa=sc.nextDouble();
        if(toan<0||toan>10
                ||ly<0||ly>10
            ||hoa<0||hoa>10){System.out.println("Diem khong hop le ");return;}
        dtb=(toan*2+ly+hoa)/4;
        System.out.println("Diem trung binh"+String.format("%.2f",dtb));
        if(dtb>=8){System.out.println("Hoc Luc : Gioi");}
        else if (dtb>=6.5){System.out.println("Hoc Luc : Kha");}
        else if (dtb>=5){System.out.println("Hoc Luc:Trung Binh");}
        else {System.out.println("Hoc Luc :Yeu");}
        
        }
                

        
        
        }
            
        
        
    
    

