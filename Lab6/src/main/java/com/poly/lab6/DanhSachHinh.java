
package com.poly.lab6;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHinh {

    public static void main(String[] args) {

        List<Circle> shapes = new ArrayList<>();

        shapes.add(new Circle(1, "Do"));
        shapes.add(new Cylinder(1, "Do", 2));
        shapes.add(new Circle(2, "Trang"));
        shapes.add(new Cylinder(2, "Xanh", 3));

        int soHinhTron = 0;
        int soHinhTru = 0;
        double tongTheTich = 0;

        for (Circle s : shapes) {

            System.out.printf(
                    java.util.Locale.US,
                    "%s -> getArea() = %.2f%n",
                    s, s.getArea()
            );

            if (s instanceof Cylinder) {
                Cylinder cy = (Cylinder) s;
                soHinhTru++;
                tongTheTich += cy.getVolume();
            } else if (s instanceof Circle) {
                soHinhTron++;
            }
        }

        System.out.println("So hinh tron: " + soHinhTron);
        System.out.println("So hinh tru: " + soHinhTru);

        System.out.printf(
                java.util.Locale.US,
                "Tong the tich cac hinh tru: %.2f%n",
                tongTheTich
        );
    }
}
