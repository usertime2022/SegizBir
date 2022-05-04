package com.company;

public class SegizUch {
    public static void main(String[] args) {
        koshuu(12, 20);
        aluu(12, 20);
        koboituu(12, 20);
        boluu(20, 12);
    }
    static void koshuu(int a, int b) {
        System.out.println(a + b);
    }
    static void aluu(int a, int b) {
        System.out.println(a - b);
    }
    static void koboituu(int a, int b) {
        System.out.println(a * b);
    }
    static void boluu(int a, int b) {
        System.out.println((double) a / b);
    }
}
