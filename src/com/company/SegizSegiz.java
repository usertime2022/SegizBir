package com.company;

import java.util.Scanner;

public class SegizSegiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
    static void method(int a, int b, int c){
        int abb = Math.max(a, b);
        int max = Math.max(abb, c);

        int amb = Math.min(a, b);
        int min = Math.min(amb, c);

        int mid = (a+b+c)-(min+max);
        System.out.println(min+", "+mid+", "+max+".");
    }
}
