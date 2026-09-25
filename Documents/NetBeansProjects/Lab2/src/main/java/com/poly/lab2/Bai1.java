/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bai1 {

    public static void main(String[] args) {
   Scanner sc =new Scanner (System.in);
        System.out.println("Nhap n:");
        int n=sc.nextInt();
        if(n%2==0){System.out.println(n+"la so chan");}
        else{System.out.println(n+"la so le");
        
        }
        if(n>0){System.out.println(n+"la so duong");}
        else if (n<0){System.out.println(n+"la so am");}
        else{System.out.println(n+" bang 0");}
                 
    }


    }

