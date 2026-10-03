
package com.poly.lab2;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double toan , ly , hoa , dtb;
        System.out.println("Nhap diem toan :");
        toan = sc.nextDouble();
        System.out.println("Nhap Diem Ly:");
        ly = sc.nextDouble();
        System.out.println("Nhap diem Hoa:");
        hoa = sc.nextDouble();
        if(toan<0||toan>10
                ||ly<0||ly>10
                ||hoa<0||hoa>10){System.out.println("Diem Khong Hop Le");return;}
        dtb=(toan*2+ly+hoa)/4;
        if(dtb>=8){System.out.println("Xep Loai Gioi");}
        else if (dtb>=6.5){System.out.println("Xep Loai Kha");}
        else if (dtb>=5){System.out.println("Xep Loai Trung Binh");}
        else {System.out.println("xep loai yeu");}
                System.out.printf("Diem Trung BInh:%.2f\n",dtb);
                
                }
    }
        
        
        
                

        
        
        
            
        
        
    
    

