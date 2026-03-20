package com.tien.Session06;
import java.util.Scanner;

public class Cau2 {
    static Scanner sc = new Scanner(System.in);

    static String hoTen = "";
    static String email = "";
    static String sdt = "";
    static String matKhau = "";

    //Nhập thông tin
    public static void nhapThongTin() {
        sc.nextLine(); // clear buffer

        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập email: ");
        email = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        sdt = sc.nextLine();

        System.out.print("Nhập mật khẩu: ");
        matKhau = sc.nextLine();
    }

    //Chuẩn hóa họ tên
    public static void chuanHoaHoTen() {
        hoTen = hoTen.trim().toLowerCase();
        String[] words = hoTen.split("\\s+");

        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        System.out.println("Họ tên sau chuẩn hóa: " + result.trim());
    }

    // 3. Kiểm tra email
    public static void kiemTraEmail() {
        if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    // Kiểm tra số điện thoại VN
    public static void kiemTraSDT() {
        if (sdt.matches("^(03|05|07|08|09)\\d{8}$")) {
            System.out.println("SĐT hợp lệ");
        } else {
            System.out.println("SĐT không hợp lệ");
        }
    }

    //Kiểm tra mật khẩu
    public static void kiemTraMatKhau() {
        if (matKhau.length() < 8) {
            System.out.println("Mật khẩu phải >= 8 ký tự");
            return;
        }

        boolean hasLower = matKhau.matches(".*[a-z].*");
        boolean hasUpper = matKhau.matches(".*[A-Z].*");
        boolean hasDigit = matKhau.matches(".*\\d.*");
        boolean hasSpecial = matKhau.matches(".*[^a-zA-Z0-9].*");

        if (hasLower && hasUpper && hasDigit && hasSpecial) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }
    }

    // Menu
    public static void menu() {
        int choice;

        do {
            System.out.println("\n******** QUẢN LÝ NGƯỜI DÙNG ********");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email");
            System.out.println("4. Kiểm tra số điện thoại");
            System.out.println("5. Kiểm tra mật khẩu");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhapThongTin();
                    break;
                case 2:
                    chuanHoaHoTen();
                    break;
                case 3:
                    kiemTraEmail();
                    break;
                case 4:
                    kiemTraSDT();
                    break;
                case 5:
                    kiemTraMatKhau();
                    break;
                case 6:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Sai lựa chọn!");
            }

        } while (choice != 6);
    }

    public static void main(String[] args) {
        menu();
    }
}
