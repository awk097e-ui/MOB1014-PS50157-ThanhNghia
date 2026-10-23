
package com.poly.asm;

import java.util.Scanner;

public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double donGia;
    protected int soLuong;

    protected static final Scanner sc = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void Nhap() {
        System.out.print("Nhap ma san pham: ");
        maSP = sc.nextLine();

        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public void Xuat() {
        System.out.printf(
            "Ma SP: %s | Ten SP: %s | Don gia: %.2f | So luong: %d | Thanh tien: %.2f%n",
            maSP, tenSP, donGia, soLuong, getThanhTien()
        );
    }

    public double thanhTien() {
        return donGia * soLuong;
    }

    public double getThanhTien() {
        return thanhTien();
    }

    public void capNhat() {
        System.out.print("Nhap ten san pham moi: ");
        tenSP = sc.nextLine();

        System.out.print("Nhap don gia moi: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong moi: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public String getMaSP() {
        return maSP;
    }
}
