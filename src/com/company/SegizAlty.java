package com.company;

public class SegizAlty {
    public static void main(String[] args) {
        method1(new int[]{12,23,34,45,56,67,78,89,90});
    }
    static void method1(int[]massiv){
        for (int i = 0; i <massiv.length ; i++) {
            System.out.print(massiv[i]+" ");
        }
    }
}
