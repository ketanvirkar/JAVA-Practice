package com.smv;
import java.util.Scanner;
public class java_practice_set4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //que 2
        /*

        System.out.print("Enter the Marathi marks: ");
        float mar = sc.nextInt();
        System.out.print("Enter the English marks: ");
        float eng = sc.nextInt();
        System.out.print("Enter the History marks: ");
        float his = sc.nextInt();
        float total = mar + eng + his;
        float percentage = (total/300)*100;
        System.out.println("Your total marks is "+total);
        System.out.println("Your Percentage is "+percentage+"%");

        if(percentage>=40 && mar>=33 && eng>=33 && his>=33)
        {
            System.out.println("Congrats! You are Passed");
        }
        else
        {
            System.out.println("Better luck next time !!");
        }
        */
        /*
        // que 3
        System.out.print("Enter Your Income: ");
        long income = sc.nextLong();
        float tax = 0;

        if(income<250000)
        {
            tax = tax + 0;
        }
        else if(income>250000 && income<=500000)
        {
           tax = tax + 0.05f*(income-250000);
        }
        else if(income>500000 && income<1000000)
        {
            tax = tax + 0.05f*(500000 - 250000);
            tax = tax + 0.20f*(income-500000);
        }
        else if(income>1000000)
        {
            tax = tax + 0.05f*(500000-250000);
            tax = tax + 0.20f*(1000000-500000);
            tax = tax + 0.30f*(income-1000000);
        }

        System.out.print("Total tax paid is: "+tax);

        */
        //que 4
/*
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        switch (num)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        */

        //que 5
/*
        System.out.print("Enter the Year:");
        long year = sc.nextLong();
        if(((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            System.out.println("This is a leap year");
        }else
        {
            System.out.println("This is not a leap year");
        }
*/
        //que 6

        System.out.print("Enter your Website: ");
        String website = sc.nextLine();
        if(website.endsWith(".com"))
        {
            System.out.println("It is a Commertial Website");
        }
        else if(website.endsWith(".org"))
        {
            System.out.println("It is a Organisational Website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("It is a Indian Website");
        }
    }
}
