package com.smv;

public class java_practice_set5 {
    public static void main(String[] args) {

        //1
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}