package com.tien.Session06;
import java.util.Scanner;

public class Cau1 {
    static Scanner sc = new Scanner(System.in);

    static double[] diem = new double[100];
    static int n = 0;

    //Nhập danh sách điểm
    public static void nhapDanhSach() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }
    }

    //In danh sách
    public static void inDanhSach() {
        System.out.println("Danh sách điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("SV " + (i + 1) + ": " + diem[i]);
        }
    }

    //Tính trung bình
    public static void tinhTrungBinh() {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diem[i];
        }
        System.out.println("Điểm trung bình: " + (sum / n));
    }

    //Tìm max - min
    public static void timMaxMin() {
        double max = diem[0], min = diem[0];

        for (int i = 1; i < n; i++) {
            if (diem[i] > max) max = diem[i];
            if (diem[i] < min) min = diem[i];
        }

        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
    }

    //Đếm đậu / rớt
    public static void demDatTruot() {
        int dat = 0, truot = 0;

        for (int i = 0; i < n; i++) {
            if (diem[i] >= 5) dat++;
            else truot++;
        }

        System.out.println("Số SV đậu: " + dat);
        System.out.println("Số SV rớt: " + truot);
    }

    //Sắp xếp tăng dần (Bubble Sort)
    public static void sapXepTangDan() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    double temp = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp tăng dần!");
    }

    // Thống kê giỏi + xuất sắc
    public static void thongKeGioiXuatSac() {
        int gioi = 0;

        for (int i = 0; i < n; i++) {
            if (diem[i] >= 8) gioi++;
        }

        System.out.println("Số SV giỏi/xuất sắc: " + gioi);
    }

    // Menu
    public static void menu() {
        int choice;

        do {
            System.out.println("\n******** QUẢN LÝ ĐIỂM SV ********");
            System.out.println("1. Nhập danh sách điểm");
            System.out.println("2. In danh sách");
            System.out.println("3. Tính trung bình");
            System.out.println("4. Tìm max - min");
            System.out.println("5. Đếm đậu / rớt");
            System.out.println("6. Sắp xếp tăng dần");
            System.out.println("7. Thống kê giỏi / xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3:
                    tinhTrungBinh();
                    break;
                case 4:
                    timMaxMin();
                    break;
                case 5:
                    demDatTruot();
                    break;
                case 6:
                    sapXepTangDan();
                    break;
                case 7:
                    thongKeGioiXuatSac();
                    break;
                case 8:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 8);
    }

    public static void main(String[] args) {
        menu();
    }
}

