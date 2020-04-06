package com.tgt.igniteplus;
import java.util.Scanner;

public class AverageArray
{
    public static void main(String[] args)
    {
        int n;
        double sum = 0.0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i <n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        double average=sum/n;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+average);
    }
}

