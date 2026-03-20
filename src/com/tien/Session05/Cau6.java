package com.tien.Session05;
import java.util.Scanner;
import java.util.Arrays;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] danhSach = new String[1000]; // mảng lưu tên
        int soLuong = 0; // số sinh viên hiện có

        int luaChon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm tên sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo từ khóa");
            System.out.println("4. Đếm tên bắt đầu bằng chữ cái");
            System.out.println("5. Sắp xếp danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            luaChon = sc.nextInt();
            sc.nextLine(); // bỏ enter

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String tenMoi = sc.nextLine();
                    danhSach[soLuong++] = tenMoi;
                    System.out.println("Đã thêm!");
                    break;

                case 2:
                    hienThiDanhSach(danhSach, soLuong);
                    break;

                case 3:
                    System.out.print("Nhập từ khóa: ");
                    String tuKhoa = sc.nextLine();
                    timTheoTuKhoa(danhSach, soLuong, tuKhoa);
                    break;

                case 4:
                    System.out.print("Nhập chữ cái: ");
                    char chuCai = sc.nextLine().charAt(0);
                    demTheoChuCai(danhSach, soLuong, chuCai);
                    break;

                case 5:
                    sapXepDanhSach(danhSach, soLuong);
                    System.out.println("Đã sắp xếp!");
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (luaChon != 0);

        sc.close();
    }

    //  Hiển thị danh sách
    public static void hienThiDanhSach(String[] danhSach, int soLuong) {
        if (soLuong == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < soLuong; i++) {
            System.out.println((i + 1) + ". " + danhSach[i]);
        }
    }

    // Tìm theo từ khóa
    public static void timTheoTuKhoa(String[] danhSach, int soLuong, String tuKhoa) {
        boolean timThay = false;

        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].toLowerCase().contains(tuKhoa.toLowerCase())) {
                System.out.println(danhSach[i]);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy!");
        }
    }

    //  Đếm theo chữ cái đầu
    public static void demTheoChuCai(String[] danhSach, int soLuong, char chuCai) {
        int dem = 0;

        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].toLowerCase().charAt(0) == Character.toLowerCase(chuCai)) {
                dem++;
            }
        }

        System.out.println("Số sinh viên: " + dem);
    }

    //  Sắp xếp danh sách
    public static void sapXepDanhSach(String[] danhSach, int soLuong) {
        // copy phần tử có dữ liệu sang mảng tạm
        String[] tam = Arrays.copyOf(danhSach, soLuong);

        Arrays.sort(tam);

        // copy ngược lại
        for (int i = 0; i < soLuong; i++) {
            danhSach[i] = tam[i];
        }
    }
}