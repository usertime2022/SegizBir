package com.company;

import java.util.Scanner;

public class SegizJeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method1(scanner.nextInt());
    }
    static void method1(int a){
        for (int i = 0; i <a ; i++) {
            System.out.print("*");

        }
    }
}
