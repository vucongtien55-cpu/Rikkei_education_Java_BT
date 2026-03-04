package Session02;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tong tu 1 den " + n + " la: " + tong);
    }
}
