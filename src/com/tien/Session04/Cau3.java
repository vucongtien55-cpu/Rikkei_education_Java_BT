package com.tien.Session04;

import java.util.Scanner;

public class Cau3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhap kich thuoc mang
        System.out.print("Nhap so phan tu cua mang: ");
        int soPhanTu = scanner.nextInt();

        int[] mang = new int[soPhanTu];

        // Nhap gia tri cho mang
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print("mang[" + i + "] = ");
            mang[i] = scanner.nextInt();
        }

        // ===== SAP XEP CHON GIAM DAN =====
        for (int i = 0; i < soPhanTu - 1; i++) {

            int viTriMax = i;

            for (int j = i + 1; j < soPhanTu; j++) {

                if (mang[j] > mang[viTriMax]) {
                    viTriMax = j;
                }

            }

            int temp = mang[i];
            mang[i] = mang[viTriMax];
            mang[viTriMax] = temp;
        }

        // Hien thi mang sau khi sap xep
        System.out.println("\nMang sau khi sap xep giam dan:");

        for (int i = 0; i < soPhanTu; i++) {
            System.out.print(mang[i] + " ");
        }

        //nhập số cần tìm
        System.out.print("\n\nNhap so can tim: ");
        int soCanTim = scanner.nextInt();

        // tìm kiếm tueeens tính
        int viTriTuyenTinh = -1;

        for (int i = 0; i < soPhanTu; i++) {

            if (mang[i] == soCanTim) {
                viTriTuyenTinh = i;
                break;
            }

        }

        // tìm kiếm nhị phân
        int trai = 0;
        int phai = soPhanTu - 1;
        int viTriNhiPhan = -1;

        while (trai <= phai) {

            int giua = (trai + phai) / 2;

            if (mang[giua] == soCanTim) {
                viTriNhiPhan = giua;
                break;
            }

            if (mang[giua] < soCanTim) {
                phai = giua - 1;
            } else {
                trai = giua + 1;
            }

        }

        // hiển thị kết quả

        if (viTriTuyenTinh != -1) {
            System.out.println("Tim thay bang tim kiem tuyen tinh tai vi tri: " + viTriTuyenTinh);
        } else {
            System.out.println("Khong tim thay bang tim kiem tuyen tinh");
        }

        if (viTriNhiPhan != -1) {
            System.out.println("Tim thay bang tim kiem nhi phan tai vi tri: " + viTriNhiPhan);
        } else {
            System.out.println("Khong tim thay bang tim kiem nhi phan");
        }

    }
}
