package com.tien.Session08.Cau2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> danhSach = new ArrayList<>();
        System.out.println("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập sách thứ: "+ (i+1));
            Book sach = new Book();

            System.out.println("Nhập tiêu để: ");
            sach.title = sc.nextLine();

            System.out.println("Nhập tác giả: ");
            sach.author = sc.nextLine();

            System.out.println("Nhập giá sách: ");
            sach.price = sc.nextDouble();
            sc.nextLine();

            danhSach.add(sach);
        }

        System.out.println("Danh sách book vừa nhập: ");
        for(Book b : danhSach){
            b.displayInfo();
            System.out.println();
        }
    }
}
