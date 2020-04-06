package com.tgt.igniteplus;
//Program to concatenate two strings
import java.util.Scanner;
public class ConCat
{
    public static void main(String[] args)
    {
        System.out.println("Enter the first string\n");
        Scanner in=new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Enter the second string\n");
        Scanner in1=new Scanner(System.in);
        String b = in1.nextLine();
        String c = a.concat(b);
        System.out.println(c);
    }
}
