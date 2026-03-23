package com.tien.Session03;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        String hoTen = sc.nextLine();

        System.out.println("Nhap ten san pham: ");
        String tenSp = sc.nextLine();

        System.out.println("Nhap gia san pham: ");
        double giaSp = sc.nextDouble();

        System.out.println("Nhap so luong mua: ");
        int soLuongMua = sc.nextInt();

        System.out.println("Khach co the thanh vien khong?");
        boolean theThanhVien = sc.nextBoolean();

        double thanhTien = giaSp * soLuongMua;
        double giamGia = 0;
        if(theThanhVien){
           giamGia = thanhTien * 0.10;
        }

        double tienSauGiam = thanhTien - giamGia;

        double vat = tienSauGiam * 0.08;

        double tongThanhToan = tienSauGiam + vat;
        System.out.println();
        System.out.println("Khach hang: " + hoTen);
        System.out.println("San pham: " + tenSp);
        System.out.println("So luong: " + soLuongMua);
        System.out.println("Don gia: " + giaSp);
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Tien vat: " + vat);
        System.out.println("Tong thanh toan: " + tongThanhToan);
    }
}
