
package com.poly.asm;

import java.util.ArrayList;

public class QuanLyGiaiDoan2 {
    static ArrayList<SanPham> danhSach = new ArrayList<>();

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("\n===== GIAI DOAN 2 =====");
            System.out.println("1. Them san pham dien tu");
            System.out.println("2. Them san pham tieu dung");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Cap nhat san pham");
            System.out.println("5. Xoa san pham");
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
                    SanPhamDienTu dt = new SanPhamDienTu();
                    dt.Nhap();
                    danhSach.add(dt);
                    System.out.println("Them san pham dien tu thanh cong!");
                    break;

                case 2:
                    SanPhamTieuDung td = new SanPhamTieuDung();
                    td.Nhap();
                    danhSach.add(td);
                    System.out.println("Them san pham tieu dung thanh cong!");
                    break;

                case 3:
                    hienThi();
                    break;

                case 4:
                    capNhat();
                    break;

                case 5:
                    xoa();
                    break;

                case 0:
                    System.out.println("Ket thuc giai doan 2!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }

    public static void hienThi() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (SanPham sp : danhSach) {
            if (sp instanceof SanPhamDienTu) {
                System.out.println("\nLoai san pham: Dien tu");
            } else if (sp instanceof SanPhamTieuDung) {
                System.out.println("\nLoai san pham: Tieu dung");
            }

            sp.Xuat();
        }
    }

    public static void capNhat() {
        System.out.print("Nhap ma san pham can cap nhat: ");
        String ma = SanPham.sc.nextLine();

        for (SanPham sp : danhSach) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                sp.capNhat();
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay san pham!");
    }

    public static void xoa() {
        System.out.print("Nhap ma san pham can xoa: ");
        String ma = SanPham.sc.nextLine();

        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSP().equalsIgnoreCase(ma)) {
                danhSach.remove(i);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay san pham!");
    }
}
