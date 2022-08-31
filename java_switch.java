package com.smv;
import java.sql.SQLOutput;
import java.util.Scanner;
public class java_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        switch(age)
        {
            case 15:
                System.out.println("you are not adult");
                break;
            case 19:
                System.out.println("yor are adult");
                break;
            case 60:
                System.out.println("you are old");
                break;
            default:
                System.out.println("i love u");
        }

    }
}
