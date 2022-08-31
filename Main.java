package com.smv;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* write your code here
        int num1=2;
        int num2=4;
        int num3=6;
        int sum=num1+num2+num3;
        System.out.println("Sum of three numbers is: "+sum);

*/
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the KM: ");
        float km = sc.nextFloat();
        float mile = km*0.62137119f;
        System.out.println(km+" KM is equal to "+mile+" miles");
    }
}
