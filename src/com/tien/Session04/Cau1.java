package com.tien.Session04;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ " + (i+1)+":");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi được sắp xếp giảm dần: ");

        for(int i = 0; i < n; i++){
            System.out.println(a[i]);

        }

    }
}
