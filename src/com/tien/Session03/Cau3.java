package com.tien.Session03;
import java.util.*;
public class Cau3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> danhSachLuong = new ArrayList<>();

        int luaChon;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhap luong nhan vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Tinh tong tien thuong");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");

            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    while (true) {
                        System.out.print("Nhap luong (-1 de ket thuc): ");
                        double luong = sc.nextDouble();

                        if (luong == -1) {
                            break; // thoat nhap
                        }

                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println("Luong khong hop le!");
                            continue; // bo qua va nhap lai
                        }

                        danhSachLuong.add(luong);

                        if (luong < 5_000_000) {
                            System.out.println("Thu nhap thap");
                        } else if (luong < 15_000_000) {
                            System.out.println("Thu nhap trung binh");
                        } else if (luong < 50_000_000) {
                            System.out.println("Thu nhap kha");
                        } else {
                            System.out.println("Thu nhap cao");
                        }
                    }
                    break;

                case 2:
                    if (danhSachLuong.isEmpty()) {
                        System.out.println("Chua co du lieu");
                        break;
                    }

                    double tongLuong = 0;
                    double max = danhSachLuong.get(0);
                    double min = danhSachLuong.get(0);

                    for (double luong : danhSachLuong) {
                        tongLuong += luong;

                        if (luong > max) {
                            max = luong;
                        }

                        if (luong < min) {
                            min = luong;
                        }
                    }

                    double luongTB = tongLuong / danhSachLuong.size();

                    System.out.println("===== THONG KE =====");
                    System.out.println("So nhan vien: " + danhSachLuong.size());
                    System.out.println("Tong luong: " + tongLuong);
                    System.out.println("Luong trung binh: " + luongTB);
                    System.out.println("Luong cao nhat: " + max);
                    System.out.println("Luong thap nhat: " + min);
                    break;

                case 3:
                    if (danhSachLuong.isEmpty()) {
                        System.out.println("Chua co du lieu");
                        return; // dung return theo yeu cau
                    }

                    double tongThuong = 0;

                    for (int i = 0; i < danhSachLuong.size(); i++) {
                        double luong = danhSachLuong.get(i);
                        double thuong = 0;

                        if (luong <= 5_000_000) {
                            thuong = luong * 0.05;
                        } else if (luong <= 15_000_000) {
                            thuong = luong * 0.10;
                        } else if (luong <= 50_000_000) {
                            thuong = luong * 0.15;
                        } else if (luong <= 100_000_000) {
                            thuong = luong * 0.20;
                        } else {
                            thuong = luong * 0.25;
                        }

                        tongThuong += thuong;
                    }

                    System.out.println("Tong tien thuong cho tat ca nhan vien: " + tongThuong);
                    break;

                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    System.exit(0);

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (luaChon != 4);
    }
}
