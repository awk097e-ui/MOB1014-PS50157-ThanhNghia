
package com.poly.lab8;

import java.util.Scanner;

public class KiemTraMatKhau {

    public static void kiemTra(String pw)
            throws InvalidPasswordException {

        int chuHoa = 0;
        int chuThuong = 0;
        int chuSo = 0;
        int kyTuDacBiet = 0;

        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);

            if (Character.isUpperCase(c)) {
                chuHoa++;
            } else if (Character.isLowerCase(c)) {
                chuThuong++;
            } else if (Character.isDigit(c)) {
                chuSo++;
            } else if ("!@#$%^&*".indexOf(c) >= 0) {
                kyTuDacBiet++;
            }
        }

        if (pw.length() < 8) {
            throw new InvalidPasswordException(
                    "Mat khau phai co it nhat 8 ky tu");
        }

        if (chuHoa < 2) {
            throw new InvalidPasswordException(
                    "Mat khau phai co it nhat 2 chu hoa");
        }

        if (chuThuong < 2) {
            throw new InvalidPasswordException(
                    "Mat khau phai co it nhat 2 chu thuong");
        }

        if (chuSo < 3) {
            throw new InvalidPasswordException(
                    "Mat khau phai co it nhat 3 chu so");
        }

        if (kyTuDacBiet < 1) {
            throw new InvalidPasswordException(
                    "Mat khau phai co it nhat 1 ky tu dac biet (!@#$%^&*)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap mat khau: ");
            String pw = sc.nextLine();

            try {
                kiemTra(pw);

                System.out.println("Mat khau hop le!");
                break;

            } catch (InvalidPasswordException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        sc.close();
    }
}
