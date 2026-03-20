package com.tien.Session05;
import java.util.Scanner;
public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu: ");
        String matKhau = sc.nextLine();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";

        if (matKhau.matches(regex)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        sc.close();
    }
}
