package com.company;

import java.util.Arrays;

public class SegizToguz {
    public static void main(String[] args) {
        method1(new int[]{1,8,3,0,23,4,9,12});
        method2(new int[]{1,8,3,0,23,4,9,12});
    }
    static void method1(int[]massiv){
        int minimum = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            minimum=Math.min(minimum,massiv[i]);
        }
        System.out.println("Massiv: "+ Arrays.toString(massiv));
        System.out.println("Minimalnyi element: "+minimum);
    }
    static void method2(int[]massiv){
        int maximum = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            maximum=Math.max(maximum,massiv[i]);

        }
        System.out.println("Maksimalnyi element: "+maximum);
    }
}
