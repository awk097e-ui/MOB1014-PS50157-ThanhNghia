
package com.poly.asm;

public class SanPhamTieuDung extends SanPham {
    private Double giamGia;

    public SanPhamTieuDung() {
        super();
        giamGia = 0.0;
    }

    public SanPhamTieuDung(String maSP, String tenSP, double donGia,
                           int soLuong, Double giamGia) {
        super(maSP, tenSP, donGia, soLuong);
        this.giamGia = giamGia;
    }

    @Override
    public void Nhap() {
        super.Nhap();

        System.out.print("Nhap phan tram giam gia: ");
        giamGia = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double getThanhTien() {
        return donGia * soLuong * (1 - giamGia / 100.0);
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Giam gia: " + giamGia + "%");
    }
}
