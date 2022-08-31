package com.smv;
import java.util.Scanner;
public class java_loops {
    public static void main(String[] args) {
//while loop
        /*
        int i = 100;
        while(i<=200)
        {
            System.out.println(i);
            i++;
        }
        */

        //do while loop
        /*
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
*/
/*
        //for loop
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the number: ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println(2*i+1);
        }
*/
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for (int i = n; i >0 ; i--) {
            System.out.println(i);
        }
    }
}
