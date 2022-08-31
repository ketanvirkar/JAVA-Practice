package com.smv;
import java.util.Scanner;
public class java_Practice_set6 {
    public static void main(String[] args) {

        //1
        /*
        float sum=0;
        float[] num ={1.6f, 11.5f, 13.8f };
        for(int i=0; i< num.length; i++)
        {
            sum=sum+num[i];
        }
        System.out.println(sum);



        //2
        int[]marks={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int num = sc.nextInt();
        boolean isInArray=false;
        for(int element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if(isInArray)
            {
                System.out.println("Entered Value is present in the Array");
            }else
            {
                System.out.println("Entered Value is not present in the Array");
            }

            //3
        float average=0;
        float sum=0;
        float[] marks ={96.6f, 88.5f, 56.8f, 90.5f, 85.4f };
        for(int i=0; i< marks.length; i++)
        {
            sum=sum+marks[i];
            average=sum/marks.length;
        }

        System.out.println("Average marks of Student is: "+average);


        //4
        int [][]mat1={{1,2,3},
                      {4,5,6}};
        int [][]mat2={{3,4,5},
                      {2,4,7}};
        int [][]result={{0,0,0},
                        {0,0,0}};
        for(int i=0; i<mat1.length; i++)
        {
            for(int j=0; j<mat1[i].length; j++)
            {
                System.out.format("i=%d,j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0; i<mat1.length; i++)
        {
            for(int j=0; j<mat1[i].length; j++)
            {
                System.out.print(result[i][j]+" ");

            }
            System.out.println("");
        }


        //5
        int[]num={1,2,3,4,5};
        for(int i= num.length-1; i>=0; i--)
        {
            System.out.println(num[i]);
        }


        //5
        int[]num={1,2,3,4,5};
        int l = num.length;
        int n = Math.floorDiv(l,2);
        int temp=0;
        for(int i=0; i<n; i++)
        {
            temp=num[i];
            num[i]=num[l-1-i];
            num[l-1-i]=temp;
        }
        for(int element:num)
        {
            System.out.println(element);
        }

        //6
        int[]num={1,2,33,4,5};
        int max=0;
        for(int e:num)
        {
            if(e>max)
            {
                max=e;
            }
        }
        System.out.println("The max element is: "+max);
*/
        //8
        boolean issorted=true;
        int[]arr={1,2,3,4,5};

        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1]) {
                issorted = false;
                break;
            }
            }
            if(issorted)
            {
                System.out.println("Given Array is sorted");
            }else {
                System.out.println("Given Array is not Sorted");
            }
        }
    }

