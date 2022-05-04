package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        if (san == 1) {
            hello();
        } else {
            bye();
        }
    }

    static void hello() {
        System.out.println("Hello");
    }

    static void bye() {
        System.out.println("Bye");
    }
}
