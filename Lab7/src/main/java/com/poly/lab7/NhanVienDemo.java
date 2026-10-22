
package com.poly.lab7;

public class NhanVienDemo {

    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee(
            "FT01", "Nguyen Van An", 12000000
        );

        PartTimeEmployee pt = new PartTimeEmployee(
            "PT01", "Tran Thi Binh", 80, 50000
        );

        System.out.println(ft.toString());
        System.out.printf("Luong: %.0f%n", ft.getSalary());

        System.out.println(pt.toString());
        System.out.printf("Luong: %.0f%n", pt.getSalary());
    }
}
