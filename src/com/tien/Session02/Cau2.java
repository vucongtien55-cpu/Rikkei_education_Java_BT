package com.tien.Session02;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();

        System.out.print("Nhap nam: ");
        int nam = sc.nextInt();

        int soNgay = 0;

        switch (thang) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                soNgay = 31;
                break;

            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;

            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;

            default:
                System.out.println("Thang khong hop le");
                return;
        }

        System.out.println("So ngay trong thang la: " + soNgay);
    }
}
