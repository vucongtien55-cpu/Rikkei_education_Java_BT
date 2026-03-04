package Session01;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();

        double dienTich = dai * rong;
        double chuVi = 2 * (dai + rong);

        System.out.println("Dien tich: " + dienTich);
        System.out.println("Chu vi: " + chuVi);
    }
}
