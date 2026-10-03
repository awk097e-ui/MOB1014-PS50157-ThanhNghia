/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.slide;

import java.util.List;


/**
 *
 * @author DELL
 */
public class Slide2 {
    public static void main(String[] args) {
        double soTien = 87941612;
        double so = soTien;
        String chuoi = "", them = "";
        int index = 0;
        while(so > 0) {
            int du = (int)so % 10;
            so = (int)so/10;
            switch (du) {
                case 0:
                    them = "Không";
                    break;
                case 1:
                    them = "Một";
                    break;
                case 2:
                    them = "Hai";
                    break;
                case 3:
                    them = "Ba";
                    break;
                case 4:
                    them = "Bốn";
                    break;
                case 5:
                    them = "Năm";
                    break;
                case 6:
                    them = "Sáu";
                    break;
                case 7:
                    them = "Bảy";
                    break;
                case 8:
                    them = "Tám";
                    break;
                case 9:
                    them = "Chín";
                    break;
                default:
                    throw new AssertionError();
            }
            chuoi = them.concat(" " + chuoi + " ");
            switch (index) {
                case 2:
                    chuoi = "Ngàn".concat(" " + chuoi + " ");
                    break;
                case 5:
                    chuoi = "Triệu".concat(" " + chuoi + " ");
                    break;
                case 8:
                    chuoi = "Tỉ".concat(" " + chuoi + " ");
                    break;
            }
            switch (index%3) {
                case 0:
                    chuoi = "Mười".concat(" " + chuoi + " ");
                    break;
                case 1:
                    chuoi = "Trăm".concat(" " + chuoi + " ");
                    break;
            }
            index++;
        }
        System.out.printf("Thành tiền: %.1f d\n", soTien);
        System.out.printf("Chữ số: %s\n", chuoi);
    }
}