package com.tien.Session06;

import java.util.*;

public class Cau3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> ds = new ArrayList<>();

    // 1. Thêm biển số xe
    public static void themBienSo() {
        sc.nextLine();
        System.out.print("Nhập số lượng biển số: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập biển số thứ " + (i + 1) + ": ");
            String bs = sc.nextLine().toUpperCase();

            // kiểm tra định dạng: 30F-123.45
            if (bs.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$")) {
                ds.add(bs);
            } else {
                System.out.println("Sai định dạng, nhập lại!");
                i--;
            }
        }
    }

    // 2. Hiển thị
    public static void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("Danh sách biển số:");
        for (String s : ds) {
            System.out.println(s);
        }
    }

    // 3. Tìm kiếm chính xác
    public static void timKiem() {
        sc.nextLine();
        System.out.print("Nhập biển số cần tìm: ");
        String key = sc.nextLine().toUpperCase();

        if (ds.contains(key)) {
            System.out.println("Tìm thấy!");
        } else {
            System.out.println(" Không tìm thấy!");
        }
    }

    // 4. Tìm theo mã tỉnh
    public static void timTheoTinh() {
        sc.nextLine();
        System.out.print("Nhập mã tỉnh (vd: 30, 51...): ");
        String ma = sc.nextLine();

        boolean found = false;

        for (String s : ds) {
            if (s.startsWith(ma)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có biển số nào!");
        }
    }

    // 5. Sắp xếp tăng dần
    public static void sapXep() {
        Collections.sort(ds);
        System.out.println("Đã sắp xếp!");
    }

    // Menu
    public static void menu() {
        int choice;

        do {
            System.out.println("\nQl biển số xe");
            System.out.println("1. Thêm biển số");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Tìm theo mã tỉnh");
            System.out.println("5. Sắp xếp tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    themBienSo();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    timTheoTinh();
                    break;
                case 5:
                    sapXep();
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