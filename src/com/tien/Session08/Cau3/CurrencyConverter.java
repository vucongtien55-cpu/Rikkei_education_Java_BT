package com.tien.Session08.Cau3;

public class CurrencyConverter {

    private static double rate;

    public static void setRate(double r) {
        if (r <= 0) {
            System.out.println("Tỉ giá không hợp lệ!");
            return;
        }
        rate = r;
    }

    public static double getRate() {
        return rate;
    }


    public static double toUSD(int vnd) {
        if (vnd < 0) {
            System.out.println("Số tiền không hợp lệ!");
            return 0;
        }
        return vnd / rate;
    }

    public static String formatUSD(double usd) {
        return String.format("%.2f USD", usd);
    }

}
