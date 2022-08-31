package com.smv;
import java.util.Scanner;
public class java_practice_set_2 {
    public static void main(String[] args) {

        //1
        float a= 7/4f*9/2f;
        System.out.println(a);
        //2
        //encrypt
        char grade = 'A';
        grade = (char)(grade+8);
        System.out.println(grade);
        //decrypt
        grade = (char)(grade-8);
        System.out.println(grade);

        //3
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(c<8);

        //4


    }
}
