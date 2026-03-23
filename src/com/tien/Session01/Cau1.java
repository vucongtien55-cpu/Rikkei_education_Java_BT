package com.tien.Session01;
import java.util.*;
public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double r = sc.nextDouble();

        double dienTich = Math.PI * r * r;

        System.out.println("Dien tich hinh tron = " + dienTich);
    }
}
