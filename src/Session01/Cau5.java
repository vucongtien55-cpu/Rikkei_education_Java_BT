package Session01;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap can nang (kg): ");
        double canNang = sc.nextDouble();

        System.out.print("Nhap chieu cao (m): ");
        double chieuCao = sc.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao);

        System.out.println("Chi so BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Gay");
        } else if (bmi < 25) {
            System.out.println("Binh thuong");
        } else if (bmi < 30) {
            System.out.println("Thua can");
        } else {
            System.out.println("Beo phi");
        }
    }
}
