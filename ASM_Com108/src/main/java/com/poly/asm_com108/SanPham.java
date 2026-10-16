
package com.poly.asm_com108;

import java.util.Scanner;

public class SanPham {

    public String maSP;
    public String tenSP;
    public double donGia;
    public int soLuong;

    public static final Scanner sc = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void nhap() {
        do {
            System.out.print("Nhap ma san pham (SPxxx): ");
            maSP = sc.nextLine().trim();

            if (!maSP.matches("^SP[0-9]{3}$")) {
                System.out.println("Ma SP phai co dang SPxxx, x la chu so.");
            }
        } while (!maSP.matches("^SP[0-9]{3}$"));

        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine().trim();

        while (tenSP.isEmpty()) {
            System.out.print("Ten san pham khong duoc de trong. Nhap lai: ");
            tenSP = sc.nextLine().trim();
        }

        donGia = nhapDonGia();
        soLuong = nhapSoLuong();
    }

    public void xuat() {
        System.out.println("===== THONG TIN SAN PHAM =====");
        System.out.println("Ma san pham: " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.printf("Don gia: %.0f VND%n", donGia);
        System.out.println("So luong: " + soLuong);
        System.out.printf("Thanh tien: %.0f VND%n", thanhTien());
    }

    public double thanhTien() {
        return donGia * soLuong;
    }

    public void capNhat() {
        if (maSP == null) {
            System.out.println("Vui long nhap san pham truoc.");
            return;
        }

        System.out.print("Nhap ma san pham can cap nhat: ");
        String maSPUpdate = sc.nextLine().trim();

        if (!maSPUpdate.equalsIgnoreCase(maSP)) {
            System.out.println("Khong ton tai san pham nay.");
            return;
        }

        int choice;

        do {
            System.out.println("===== CAP NHAT SAN PHAM =====");
            System.out.println("1. Cap nhat ten san pham");
            System.out.println("2. Cap nhat don gia");
            System.out.println("3. Cap nhat so luong");
            System.out.println("4. Thoat cap nhat");
            System.out.print("Moi chon (1-4): ");

            choice = nhapSoNguyen();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten moi: ");
                    String tenMoi = sc.nextLine().trim();

                    while (tenMoi.isEmpty()) {
                        System.out.print("Ten khong duoc de trong. Nhap lai: ");
                        tenMoi = sc.nextLine().trim();
                    }

                    tenSP = tenMoi;
                    System.out.println("Cap nhat ten thanh cong.");
                    break;

                case 2:
                    donGia = nhapDonGia();
                    System.out.println("Cap nhat don gia thanh cong.");
                    break;

                case 3:
                    soLuong = nhapSoLuong();
                    System.out.println("Cap nhat so luong thanh cong.");
                    break;

                case 4:
                    System.out.println("Da thoat cap nhat.");
                    break;

                default:
                    System.out.println("Khong co chuc nang nay.");
            }
        } while (choice != 4);
    }

    private double nhapDonGia() {
        double gia;

        do {
            System.out.print("Nhap don gia: ");

            try {
                gia = Double.parseDouble(sc.nextLine().trim());

                if (gia < 0 || Double.isInfinite(gia)
                        || Double.isNaN(gia)) {
                    System.out.println("Don gia phai la so khong am.");
                    gia = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Don gia phai la mot so hop le.");
                gia = -1;
            }
        } while (gia < 0);

        return gia;
    }

    private int nhapSoLuong() {
        int sl;

        do {
            System.out.print("Nhap so luong: ");

            try {
                sl = Integer.parseInt(sc.nextLine().trim());

                if (sl < 0) {
                    System.out.println("So luong khong duoc am.");
                }
            } catch (NumberFormatException e) {
                System.out.println("So luong phai la so nguyen.");
                sl = -1;
            }
        } while (sl < 0);

        return sl;
    }

    private int nhapSoNguyen() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Vui long nhap mot so nguyen: ");
            }
        }
    }
}
