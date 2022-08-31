package com.smv;
public class java_methods {
 static int logic(int x, int y)

    {
        int z;
        if(x>y) {
             z = x + y;
        }else {
           z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

     int a=6,b=5,c;
    c=logic(a,b);
        //java_methods obj = new java_methods();
        //c= obj.logic(a,b);
        System.out.println(c);
    }

}
