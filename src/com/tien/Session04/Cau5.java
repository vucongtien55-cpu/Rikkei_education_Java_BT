package com.tien.Session04;

import java.util.Scanner;

public class Cau5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int soSinhVien = scanner.nextInt();

        double[] diem = new double[soSinhVien];

        for (int i = 0; i < soSinhVien; i++) {
            System.out.print("Nhap diem sinh vien " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }

        int luaChon;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem tat ca diem");
            System.out.println("2. Sap xep diem");
            System.out.println("3. Tim kiem diem");
            System.out.println("4. Thong ke diem");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {

                case 1:
                    System.out.println("Danh sach diem:");
                    for (double d : diem) {
                        System.out.print(d + " ");
                    }
                    System.out.println();
                    break;

                case 2:

                    System.out.println("1. Tang dan");
                    System.out.println("2. Giam dan");

                    int kieuSapXep = scanner.nextInt();

                    for (int i = 0; i < diem.length - 1; i++) {
                        for (int j = 0; j < diem.length - i - 1; j++) {

                            if (kieuSapXep == 1 && diem[j] > diem[j + 1]) {

                                double temp = diem[j];
                                diem[j] = diem[j + 1];
                                diem[j + 1] = temp;

                            }

                            if (kieuSapXep == 2 && diem[j] < diem[j + 1]) {

                                double temp = diem[j];
                                diem[j] = diem[j + 1];
                                diem[j + 1] = temp;

                            }
                        }
                    }

                    System.out.println("Mang sau khi sap xep:");
                    for (double d : diem) {
                        System.out.print(d + " ");
                    }
                    System.out.println();

                    break;

                case 3:

                    System.out.print("Nhap diem can tim: ");
                    double diemCanTim = scanner.nextDouble();

                    // Linear Search
                    int viTri = -1;

                    for (int i = 0; i < diem.length; i++) {
                        if (diem[i] == diemCanTim) {
                            viTri = i;
                            break;
                        }
                    }

                    if (viTri != -1) {
                        System.out.println("Tim thay bang Linear Search tai vi tri: " + viTri);
                    } else {
                        System.out.println("Khong tim thay bang Linear Search");
                    }

                    // Binary Search
                    int trai = 0;
                    int phai = diem.length - 1;
                    int viTriNhiPhan = -1;

                    while (trai <= phai) {

                        int giua = (trai + phai) / 2;

                        if (diem[giua] == diemCanTim) {
                            viTriNhiPhan = giua;
                            break;
                        }

                        if (diem[giua] < diemCanTim) {
                            trai = giua + 1;
                        } else {
                            phai = giua - 1;
                        }

                    }

                    if (viTriNhiPhan != -1) {
                        System.out.println("Tim thay bang Binary Search tai vi tri: " + viTriNhiPhan);
                    } else {
                        System.out.println("Khong tim thay bang Binary Search");
                    }

                    break;

                case 4:

                    double tong = 0;
                    double max = diem[0];
                    double min = diem[0];
                    int trenTrungBinh = 0;

                    for (double d : diem) {

                        tong += d;

                        if (d > max) max = d;
                        if (d < min) min = d;
                    }

                    double trungBinh = tong / diem.length;

                    for (double d : diem) {
                        if (d > trungBinh) {
                            trenTrungBinh++;
                        }
                    }

                    System.out.println("Diem trung binh: " + trungBinh);
                    System.out.println("Diem cao nhat: " + max);
                    System.out.println("Diem thap nhat: " + min);
                    System.out.println("So sinh vien tren trung binh: " + trenTrungBinh);

                    break;

                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");

            }

        } while (luaChon != 0);

    }
}
