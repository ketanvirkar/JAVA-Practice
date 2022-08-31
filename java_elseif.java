package com.smv;
import java.util.Scanner;
public class java_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>50)
        {
            System.out.println("you are expirenced");
        }
        else if(age>40)
        {
            System.out.println("you are semi expirenced");
        }
        else {
            System.out.println("you are beginner");
        }
    }
}
