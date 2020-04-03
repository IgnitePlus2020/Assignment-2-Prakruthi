package com.tgt.igniteplus;
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        System.out.println("BASIC CALCULATOR:\n");
        System.out.println("1. ADDITION\n");
        System.out.println("2. SUBTRACTION\n");
        System.out.println("3. MULTIPLICATION\n");
        System.out.println("4. DIVISION\n");
        System.out.println("ENTER YOUR CHOICE :\n");
        int i=s.nextInt();

        System.out.println("ENTER FIRST NUMBER\n ");
        int a=s.nextInt();

        System.out.println("ENTER SECOND NUMBER \n");
        int b=s.nextInt();

        double result=0;

        switch(i)
        {
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                if(b==0)
                {
                    System.out.println("DIVISION NOT POSSIBLE");
                    break;
                }
                else
                    result=a/b;

            default:
                System.out.println("WRONG CHOICE");

        }

        System.out.println("RESULT = "+result);
    }
}