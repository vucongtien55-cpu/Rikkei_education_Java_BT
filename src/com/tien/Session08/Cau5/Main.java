package com.tien.Session08.Cau5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách");
            System.out.println("3. Tìm sinh viên GPA cao nhất");
            System.out.println("4. Tổng số sinh viên");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng SV: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1));
                        Student sv = new Student();
                        sv.input();
                        list.add(sv);
                    }
                    break;

                case 2:
                    System.out.println("Danh sách sinh viên:");
                    for (Student sv : list) {
                        sv.print();
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }

                    Student max = list.get(0);

                    for (Student sv : list) {
                        if (sv.getGpa() > max.getGpa()) {
                            max = sv;
                        }
                    }

                    System.out.println("Sinh viên GPA cao nhất:");
                    max.print();
                    break;

                case 4:
                    System.out.println("Tổng số sinh viên: " + Student.getTotalStudent());
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }
}
