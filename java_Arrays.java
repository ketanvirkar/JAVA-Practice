package com.smv;

public class java_Arrays {
    public static void main(String[] args) {

        int[]marks = new int[5];
        marks[0]=100;
        marks[1]=90;
        marks[2]=80;
        marks[3]=60;
        marks[4]=95;
      // System.out.println(marks[3]);
        float [] mark ={99.0f, 98.5f, 78.8f};
        for(int k = 0; k<mark.length; k++)
        {
            System.out.println(mark[k]);
        }
        String[] name = {"ketan","sanem","shivraj","vignesh" };
       // System.out.println(name[1]);
        //System.out.println(name.length);
        int i;
        for(i=0;i<name.length; i++ )
        {
            System.out.println(name[i]);
        }

        //quick quiz
        int [] num ={1,2,3,4,5};
        for(int j= num.length-1; j>=0; j--)
        {
            System.out.println(num[j]);
        }

        //using for each loop
        for(int elements:marks)
        {
            System.out.println(elements);
        }
    }
}
