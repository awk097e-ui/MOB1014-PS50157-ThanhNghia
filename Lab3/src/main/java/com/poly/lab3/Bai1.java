package com.poly.lab3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        System.out.println("nhap n:");
        int n=sc.nextInt();
        if(n<=0){System.out.println("n phai la so nguyen duong");
        return;
        }
        int tong=0;
        int dem =0;
        System.out.println("Cac so chia het cho 3 :");
        for (int i=1;i<=n;i++){
            if(i%3==0){System.out.println(i+" ");
            tong=tong +i;
            dem++;
            }
        }
        System.out.println("");
        if(dem==0){System.out.println("khong co so nao chia het cho 3");}
        else{System.out.println("Tong:"+tong);
        double trungBinh=(double)tong/dem;
            System.out.printf("Trung binh cong:%.2f\n",trungBinh);
        }
        }
    }


