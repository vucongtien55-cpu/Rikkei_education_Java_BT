package com.tien.Session02;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so (100-999): ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("So nhap vao khong hop le");
            return;
        }

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        String result = "";

        switch (hundreds) {
            case 1: result += "Mot tram "; break;
            case 2: result += "Hai tram "; break;
            case 3: result += "Ba tram "; break;
            case 4: result += "Bon tram "; break;
            case 5: result += "Nam tram "; break;
            case 6: result += "Sau tram "; break;
            case 7: result += "Bay tram "; break;
            case 8: result += "Tam tram "; break;
            case 9: result += "Chin tram "; break;
        }

        switch (tens) {
            case 0:
                if (units != 0) result += "le ";
                break;
            case 1:
                result += "muoi ";
                break;
            case 2: result += "hai muoi "; break;
            case 3: result += "ba muoi "; break;
            case 4: result += "bon muoi "; break;
            case 5: result += "nam muoi "; break;
            case 6: result += "sau muoi "; break;
            case 7: result += "bay muoi "; break;
            case 8: result += "tam muoi "; break;
            case 9: result += "chin muoi "; break;
        }

        switch (units) {
            case 1: result += "mot"; break;
            case 2: result += "hai"; break;
            case 3: result += "ba"; break;
            case 4: result += "bon"; break;
            case 5: result += "nam"; break;
            case 6: result += "sau"; break;
            case 7: result += "bay"; break;
            case 8: result += "tam"; break;
            case 9: result += "chin"; break;
        }

        System.out.println(result.trim());
        sc.close();
    }
}
