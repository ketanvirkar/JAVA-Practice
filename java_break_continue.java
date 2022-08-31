package com.smv;

public class java_break_continue {
    public static void main(String[] args) {

        int i = 0;
        while(i<=5)
        {

            System.out.println(i);
            i++;
            if(i==2)
            {
                break;
            }
        }
        int a = 0;
        while(a<=5)
        {


            a++;
            if(a==2)
            {
                continue;
            }
            System.out.println(a);
        }

    }
}
