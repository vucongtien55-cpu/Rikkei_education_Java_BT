package com.tien.Session08.Cau4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle[] list = new Rectangle[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập hình chữ nhật thứ " + (i + 1));

            System.out.print("Width: ");
            double w = sc.nextDouble();

            System.out.print("Height: ");
            double h = sc.nextDouble();

            list[i] = new Rectangle(w, h);
        }

        System.out.println("Danh sách hình:");
        for (Rectangle r : list) {
            System.out.println(r);
        }

        double maxArea = list[0].getArea();

        for (Rectangle r : list) {
            if (r.getArea() > maxArea) {
                maxArea = r.getArea();
            }
        }

        int count = 0;
        for (Rectangle r : list) {
            if (Math.abs(r.getArea() - maxArea) < 0.0001) {
                count++;
            }
        }

        System.out.println("\nKết quả:");
        if (count > 1) {
            System.out.println("Có " + count + " hình có diện tích lớn nhất = " + maxArea);
            for (Rectangle r : list) {
                if (Math.abs(r.getArea() - maxArea) < 0.0001) {
                    System.out.println(r);
                }
            }
        } else {
            System.out.println("Hình có diện tích lớn nhất:");
            for (Rectangle r : list) {
                if (Math.abs(r.getArea() - maxArea) < 0.0001) {
                    System.out.println(r);
                }
            }
        }

        sc.close();
    }
}
