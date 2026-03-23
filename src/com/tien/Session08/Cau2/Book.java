package com.tien.Session08.Cau2;

public class Book {
    public String title;
    public String author;
    public double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Nhập tiêu đề: " + title);
        System.out.println("Nhập tác giả: " + author);
        System.out.println("Nhập giá tiền: " + price);
    }
}
