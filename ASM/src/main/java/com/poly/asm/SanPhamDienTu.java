
package com.poly.asm;

public class SanPhamDienTu extends SanPham {
    private String ngayBaoHanh;

    public SanPhamDienTu() {
        super();
    }

    public SanPhamDienTu(String maSP, String tenSP, double donGia,
                         int soLuong, String ngayBaoHanh) {
        super(maSP, tenSP, donGia, soLuong);
        this.ngayBaoHanh = ngayBaoHanh;
    }

    @Override
    public void Nhap() {
        super.Nhap();

        System.out.print("Nhap ngay bao hanh: ");
        ngayBaoHanh = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Ngay bao hanh: " + getBaoHanh());
    }

    public String getBaoHanh() {
        return ngayBaoHanh;
    }
}
