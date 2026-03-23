package com.tien.Session01;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap van toc (km/h): ");
        double vanToc = sc.nextDouble();

        System.out.print("Nhap thoi gian (gio): ");
        double thoiGian = sc.nextDouble();

        double quangDuong = vanToc * thoiGian;

        System.out.println("Quang duong di duoc la: " + quangDuong + " km");
    }
}
