
package com.poly.lab7;

public class DichVuNhanVien {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();

        Employee e1 = new FullTimeEmployee(
            "FT01", "Nguyen Van An", 12000000
        );

        Employee e2 = new PartTimeEmployee(
            "PT01", "Tran Thi Binh", 80, 50000
        );

        Employee e3 = new FullTimeEmployee(
            "FT02", "Le Van Nam", 15500000
        );

        Employee e4 = new FullTimeEmployee(
            "ft01", "Ngo Van Giang", 9000000
        );

        Employee[] employees = {e1, e2, e3, e4};

        for (Employee e : employees) {
            if (service.add(e)) {
                System.out.println("Them thanh cong: " + e.getId());
            } else {
                System.out.println("Them that bai, trung ID: " + e.getId());
            }
        }

        Employee found = service.findById("pt01");

        if (found != null) {
            System.out.println("Tim thay: " + found.toString());
        } else {
            System.out.println("Khong tim thay nhan vien pt01");
        }

        found = service.findById("XX99");

        if (found != null) {
            System.out.println("Tim thay: " + found.toString());
        } else {
            System.out.println("Khong tim thay nhan vien XX99");
        }

        System.out.println("=== DANH SACH NHAN VIEN ===");

        for (Employee e : service.getAll()) {
            System.out.printf("%s -> Luong: %.0f%n", e.toString(), e.getSalary());
        }

        System.out.printf("Tong luong: %.0f%n", service.getTotalSalary());
    }
}
