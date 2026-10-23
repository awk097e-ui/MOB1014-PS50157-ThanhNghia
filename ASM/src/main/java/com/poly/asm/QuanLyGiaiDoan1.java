
package com.poly.asm;

public class QuanLyGiaiDoan1 {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        boolean daNhap = false;
        int chon;

        do {
            System.out.println("\n===== GIAI DOAN 1 =====");
            System.out.println("1. Them san pham");
            System.out.println("2. Xem san pham");
            System.out.println("3. Cap nhat san pham");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            try {
                chon = Integer.parseInt(SanPham.sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
                chon = -1;
                continue;
            }

            switch (chon) {
                case 1:
                    sp.Nhap();
                    daNhap = true;
                    System.out.println("Them san pham thanh cong!");
                    break;

                case 2:
                    if (daNhap) {
                        sp.Xuat();
                    } else {
                        System.out.println("Chua co san pham!");
                    }
                    break;

                case 3:
                    if (daNhap) {
                        sp.capNhat();
                        System.out.println("Cap nhat thanh cong!");
                    } else {
                        System.out.println("Chua co san pham de cap nhat!");
                    }
                    break;

                case 0:
                    System.out.println("Ket thuc giai doan 1!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
