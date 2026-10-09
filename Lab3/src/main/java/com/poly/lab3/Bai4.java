package com.poly.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  int n;
  do{
      System.out.println("Nhap so phan tu:");
      n=sc.nextInt();
  }while(n<=0);
    
    int [] a=new int[n];
    for(int i=0;i<n;i++){
        System.out.printf("Nhap phan tu thu %d:",i + 1);
        a[i]=sc.nextInt();
        
    }
    int [] b= Arrays.copyOf(a,a.length);
        System.out.println("Nhap x:");
        int x=sc.nextInt();
        System.out.println("Vi tri cua "+x+"trong mang:");
        boolean timThay=false;
        for (int i=0;i<a.length;i++){
            if(a[i]==x){
                System.out.println(i+"");
                timThay=true;
            }
        }
        if(!timThay){
            System.out.println("Khong tim thay");
        }
        System.out.println("");
        for(int i = 0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j+1]=temp;
                }
            }
        }
             System.out.println("Mang giam dan(Bubble Sort):"+Arrays.toString(a));
             Arrays.sort(b);
             System.out.println("Mang Tang dan (Arrays.sort):"
                     +Arrays.toString(b));
    
        }
}