package com.tien.Session03;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tongHocVien = 0;
        double tongDiem = 0;
        double diemMax = Double.MIN_VALUE;
        double diemMin = Double.MAX_VALUE;

        int luaChon;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.print("Chon chuc nang: ");

            luaChon = sc.nextInt();

            switch (luaChon) {


                case 1:
                    System.out.println("Nhap diem (Nhap -1 de ket thuc)");

                    while (true) {
                        System.out.print("Nhap diem: ");
                        double diem = sc.nextDouble();

                        // ket thuc
                        if (diem == -1) {
                            break;
                        }

                        // sai du lieu
                        if (diem < 0 || diem > 10) {
                            System.out.println("Diem khong hop le! Nhap lai.");
                            continue;
                        }

                        // cap nhat thong ke
                        tongHocVien++;
                        tongDiem += diem;

                        if (diem > diemMax) {
                            diemMax = diem;
                        }

                        if (diem < diemMin) {
                            diemMin = diem;
                        }


                        if (diem < 5) {
                            System.out.println("Xep loai: Yeu");
                        } else if (diem < 7) {
                            System.out.println("Xep loai: Trung Binh");
                        } else if (diem < 8) {
                            System.out.println("Xep loai: Kha");
                        } else if (diem < 9) {
                            System.out.println("Xep loai: Gioi");
                        } else {
                            System.out.println("Xep loai: Xuat sac");
                        }
                    }
                    break;


                case 2:
                    if (tongHocVien == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double diemTB = tongDiem / tongHocVien;

                        System.out.println("\n===== THONG KE =====");
                        System.out.println("So hoc vien: " + tongHocVien);
                        System.out.println("Diem trung binh: " + diemTB);
                        System.out.println("Diem cao nhat: " + diemMax);
                        System.out.println("Diem thap nhat: " + diemMin);
                    }
                    break;


                case 3:
                    System.out.println("Ket thuc chuong trinh!");
                    System.exit(0);

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (luaChon != 3);
    }
}
