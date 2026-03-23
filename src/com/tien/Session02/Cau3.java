package com.tien.Session02;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int n = sc.nextInt();

        int tong = 0;
        n = Math.abs(n);

        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }

        System.out.println("Tong cac chu so la: " + tong);
    }
}
