package com.tien.Session05;
import java.util.Scanner;
import java.util.Random;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập n: ");
        int doDai = sc.nextInt();

        if (doDai < 1 || doDai > 1000) {
            System.out.println("n phải từ 1 đến 1000");
            return;
        }

        String tapKyTu = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder ketQua = new StringBuilder(doDai);

        for (int i = 0; i < doDai; i++) {
            int viTri = random.nextInt(tapKyTu.length());
            ketQua.append(tapKyTu.charAt(viTri));
        }

        System.out.println("Chuỗi ngẫu nhiên: " + ketQua.toString());

        sc.close();
    }
}
