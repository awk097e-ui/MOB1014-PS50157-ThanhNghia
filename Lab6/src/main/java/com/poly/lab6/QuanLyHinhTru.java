
package com.poly.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHinhTru {

    public static void main(String[] args) {

        List<Cylinder> list = new ArrayList<>();

        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));

        System.out.println("=== DANH SACH HINH TRU ===");

        double tongTheTich = 0;

        for (Cylinder cy : list) {
            System.out.println(cy);
            tongTheTich += cy.getVolume();
        }

        System.out.printf(
                java.util.Locale.US,
                "Tong the tich: %.2f%n",
                tongTheTich
        );

        Cylinder max = list.get(0);

        for (Cylinder cy : list) {
            if (cy.getVolume() > max.getVolume()) {
                max = cy;
            }
        }

        System.out.println("Hinh tru co the tich lon nhat:");
        System.out.println(max);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mau can tim: ");
        String mauCanTim = sc.nextLine().trim();

        boolean timThay = false;

        System.out.println("=== HINH TRU MAU "
                + mauCanTim + " ===");

        for (Cylinder cy : list) {
            if (cy.getColor().equalsIgnoreCase(mauCanTim)) {
                System.out.println(cy);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println(
                    "Khong co hinh tru mau " + mauCanTim
            );
        }

        sc.close();
    }
}
