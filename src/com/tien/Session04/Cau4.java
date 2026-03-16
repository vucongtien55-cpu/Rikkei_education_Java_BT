package com.tien.Session04;

import java.util.Scanner;

public class Cau4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhap so phan tu
        System.out.print("Nhap so phan tu cua mang: ");
        int soPhanTu = scanner.nextInt();

        if (soPhanTu == 0) {
            System.out.println("Mang khong co phan tu");
            return;
        }

        int[] mang = new int[soPhanTu];

        // Nhap mang
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print("mang[" + i + "] = ");
            mang[i] = scanner.nextInt();
        }

        int[] mangChan = new int[soPhanTu];
        int[] mangLe = new int[soPhanTu];

        int demChan = 0;
        int demLe = 0;

        // Tach chan va le
        for (int i = 0; i < soPhanTu; i++) {

            if (mang[i] % 2 == 0) {
                mangChan[demChan++] = mang[i];
            } else {
                mangLe[demLe++] = mang[i];
            }

        }

        // Gop lai vao mang ban dau
        int viTri = 0;

        for (int i = 0; i < demChan; i++) {
            mang[viTri++] = mangChan[i];
        }

        for (int i = 0; i < demLe; i++) {
            mang[viTri++] = mangLe[i];
        }

        // In mang sau khi sap xep
        System.out.println("Mang sau khi sap xep:");

        for (int i = 0; i < soPhanTu; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}