package com.smv;

public class java_logical_operators {
    public static void main(String[] args) {
        //logical AND
        boolean a = true;
        boolean b = false;
     //   if(a && b){
     //       System.out.println("y");
      //  }else{
      //      System.out.println("n");
       // }

        // logical OR
        if(a || b){
            System.out.println("y");

        }else
        {
            System.out.println("n");
        }

        // logical NOT

        System.out.println("!a is: ");
        System.out.println(!a);
        System.out.println("!b is: ");
        System.out.println(!b);

    }
}
