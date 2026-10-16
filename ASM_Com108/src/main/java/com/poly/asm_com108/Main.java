
package com.poly.asm_com108;

public class Main {

    public static void main(String[] args) {
        int choice;
        SanPham sp = new SanPham();

        do {
            System.out.println("\n===== MENU CHUONG TRINH =====");
            System.out.println("1. Nhap thong tin san pham");
            System.out.println("2. Hien thi thong tin san pham");
            System.out.println("3. Tinh tien san pham");
            System.out.println("4. Cap nhat thong tin san pham");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Moi chon: ");

            try {
                choice = Integer.parseInt(SanPham.sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so tu 1 den 5.");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    sp.nhap();
                    break;

                case 2:
                    if (sp.maSP == null) {
                        System.out.println("Vui long nhap san pham truoc.");
                    } else {
                        sp.xuat();
                    }
                    break;

                case 3:
                    if (sp.maSP == null) {
                        System.out.println("Vui long nhap san pham truoc.");
                    } else {
                        System.out.printf(
                                "Tong tien cua san pham %s la: %.0f VND%n",
                                sp.maSP, sp.thanhTien()
                        );
                    }
                    break;

                case 4:
                    sp.capNhat();
                    break;

                case 5:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Khong co chuc nang nay, moi chon lai.");
            }

        } while (choice != 5);
    }
}
