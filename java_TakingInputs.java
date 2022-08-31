package com.smv;
import java.util.Scanner;

public class java_TakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Chemistry: ");
        float a = sc.nextInt();
        System.out.println("Enter the marks of Maths: ");
        float b = sc.nextInt();
        System.out.println("Enter the marks of Physics: ");
        float c = sc.nextInt();
        System.out.println("Enter the marks of Hindi: ");
        float d = sc.nextInt();
        System.out.println("Enter the marks of Marathi: ");
        float e = sc.nextInt();
        float Total = a + b + c + d + e;
        System.out.println("Total marks is: "+Total);
        float percentage = Total/500*100;
        System.out.println("Your total Percentage is: "+percentage+"%");

        if(percentage>35)
        {
            System.out.println("Congratulations you are Passed with "+percentage+"%");
        }else
        {
            System.out.println("Failed! Better luck next time");
        }

    }
}
