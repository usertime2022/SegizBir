package com.company;
import java.util.Scanner;
public class SegizEki {
    public static void main(String[] args) {
method();
    }
    static void method() {
//        Scanner scanner = new Scanner(System.in);
//        int san = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d%s%2d%s%3d%s", j, " x", i, " =", i * j, "  ");
            }
            System.out.println();
        }
    }
}