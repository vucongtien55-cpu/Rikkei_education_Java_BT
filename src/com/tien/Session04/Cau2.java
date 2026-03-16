package com.tien.Session04;

import java.util.Scanner;

public class Cau2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc mang
        System.out.print("Nhap so hang: ");
        int soHang = scanner.nextInt();

        System.out.print("Nhap so cot: ");
        int soCot = scanner.nextInt();

        int[][] mang = new int[soHang][soCot];

        // Nhap gia tri cho mang
        System.out.println("Nhap cac phan tu cua mang:");

        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("mang[" + i + "][" + j + "] = ");
                mang[i][j] = scanner.nextInt();
            }
        }

        int tongChan = 0;
        int tongLe = 0;

        // Duyet mang de tinh tong
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {

                if (mang[i][j] % 2 == 0) {
                    tongChan += mang[i][j];
                } else {
                    tongLe += mang[i][j];
                }

            }
        }

        // In ket qua
        System.out.println("Tong cac so chan: " + tongChan);
        System.out.println("Tong cac so le: " + tongLe);

    }
}