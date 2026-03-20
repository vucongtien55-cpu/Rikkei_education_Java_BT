package com.tien.Session05;

public class Cau2 {
    public static void main(String[] args) {

        int n = 1_000_000;

        long start1 = System.currentTimeMillis();

        String str = "Hello";
        for (int i = 0; i < n; i++) {
            str += " World";
        }

        long end1 = System.currentTimeMillis();
        System.out.println("String: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < n; i++) {
            sb.append(" World");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end2 - start2) + " ms");

        long start3 = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < n; i++) {
            sbf.append(" World");
        }

        long end3 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end3 - start3) + " ms");
    }
}
