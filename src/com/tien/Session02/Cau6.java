package com.tien.Session02;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Nhap so nguyen duong N: ");
            if (sc.hasNextInt()) {
                N = sc.nextInt();
                if (N >= 0) break;
            } else {
                sc.next(); // bo gia tri sai
            }
            System.out.println("So nhap vao khong hop le!");
        }

        System.out.println("Cac so Armstrong tu 0 den " + N + " la:");

        for (int i = 0; i <= N; i++) {

            int temp = i;
            int count = 0;

            if (temp == 0) {
                count = 1;
            } else {
                while (temp > 0) {
                    count++;
                    temp /= 10;
                }
            }

            temp = i;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
