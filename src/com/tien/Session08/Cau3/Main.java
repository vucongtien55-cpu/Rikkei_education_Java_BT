package com.tien.Session08.Cau3;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter.setRate(25000);


        int vnd = 500000;
        double usd = CurrencyConverter.toUSD(vnd);


        System.out.println("USD: " + CurrencyConverter.formatUSD(usd));
    }
}
