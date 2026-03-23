package com.tien.Session08.Cau1;

public class Students {
    public int id;
    public String name;
    public int age;

    public Students() {
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Tuổi sinh viên: " + age);
    }
}
