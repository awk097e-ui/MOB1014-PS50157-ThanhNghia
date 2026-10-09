package com.poly.lab3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int n ;
do{System.out.println("nhap n:");
n=sc.nextInt();
}while(n<=0);
int []a=new int[n];
for (int i=0;i<a.length;i++){System.out.println("Nhap a["+i+"]:");
a[i]=sc.nextInt();
}
        System.out.println("Mang Vua nhap:");
        for (int x :a){System.out.println(x+"");}
        System.out.println("");
        int demChan=0;
        System.out.println("Cac phan tu chan:");
        for(int x:a){if(x%2!=0){continue;}
         System.out.println(x+"");
         demChan++;
        }
       if(demChan==0){System.out.println("Khong co phan tu chan");}
        System.out.println("");
        int tong =0;
        for(int x:a){if(x%4==0){
            tong+=x;}
        
        }
        System.out.println("Tong cac so chia het cho 4:"+tong);
        int max=a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat:"+max);
}
}
