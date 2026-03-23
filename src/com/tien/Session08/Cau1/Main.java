package com.tien.Session08.Cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Students> danhSach = new ArrayList<>();
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập sinh viên thứ: " + (i+1));
            Students sv = new Students();

            System.out.println("Nhập mã sinh viên: ");
            sv.id = sc.nextInt();
            sc.nextLine();

            System.out.println("Tên sinh viên: ");
            sv.name = sc.nextLine();

            System.out.println("Nhập tuổi sinh viên: ");
            sv.age = sc.nextInt();
            sc.nextLine();

            danhSach.add(sv);
        }

        System.out.println("Danh sách sinh viên bạn vừa nhập: ");
        for(Students std : danhSach){
            std.displayInfo();
            System.out.println();
        }
    }
}
