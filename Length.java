package com.tgt.igniteplus;
import java.util.Scanner;
//Program to check length of string
public class Length
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string\n");
        String str=in.nextLine();
        int len=str.length();
        System.out.println("The length of the string is "+len);
    }
}
