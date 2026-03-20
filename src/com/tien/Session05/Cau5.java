package com.tien.Session05;
import java.util.Scanner;

public class Cau5 {
    public static void demKyTu(String chuoi) {
        int chuThuong = 0, chuHoa = 0, chuSo = 0, kyTuDacBiet = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (Character.isLowerCase(kyTu)) {
                chuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                chuHoa++;
            } else if (Character.isDigit(kyTu)) {
                chuSo++;
            } else {
                kyTuDacBiet++;
            }
        }

        System.out.println("Chữ thường: " + chuThuong);
        System.out.println("Chữ hoa: " + chuHoa);
        System.out.println("Chữ số: " + chuSo);
        System.out.println("Ký tự đặc biệt: " + kyTuDacBiet);
    }

    public static void daoNguocChuoi(String chuoi) {
        StringBuilder ketQua = new StringBuilder(chuoi);
        ketQua.reverse();
        System.out.println("Chuỗi đảo ngược: " + ketQua);
    }

    public static void kiemTraPalindrome(String chuoi) {
        String daoNguoc = new StringBuilder(chuoi).reverse().toString();

        if (chuoi.equalsIgnoreCase(daoNguoc)) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải Palindrome");
        }
    }

    public static void chuanHoaChuoi(String chuoi) {
        // Xóa khoảng trắng dư
        chuoi = chuoi.trim().replaceAll("\\s+", " ");

        if (chuoi.length() == 0) {
            System.out.println("Chuỗi rỗng");
            return;
        }

        // Viết hoa chữ cái đầu
        String ketQua = chuoi.substring(0, 1).toUpperCase() + chuoi.substring(1);

        System.out.println("Chuỗi sau khi chuẩn hóa: " + ketQua);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi = "";
        int luaChon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập chuỗi");
            System.out.println("2. Đếm ký tự");
            System.out.println("3. Đảo ngược chuỗi");
            System.out.println("4. Kiểm tra Palindrome");
            System.out.println("5. Chuẩn hóa chuỗi");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập chuỗi: ");
                    chuoi = sc.nextLine();
                    break;

                case 2:
                    demKyTu(chuoi);
                    break;

                case 3:
                    daoNguocChuoi(chuoi);
                    break;

                case 4:
                    kiemTraPalindrome(chuoi);
                    break;

                case 5:
                    chuanHoaChuoi(chuoi);
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
}
