package com.smv;
import java.util.Scanner;
public class java_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You Are Adult!");
        }else
        {
            System.out.println("You are not an Adult!");
        }
    }
}