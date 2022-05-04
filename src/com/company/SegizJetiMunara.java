package com.company;

import java.util.Scanner;

public class SegizJetiMunara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method1(scanner.nextInt());
    }

    static void method1(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
