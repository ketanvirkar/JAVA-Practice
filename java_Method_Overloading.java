package com.smv;

public class java_Method_Overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(2000);
        foo(3000,4000);
    }
}
