package com.tgt.igniteplus;
import java.util.Scanner;
public class IsEmpty
{
    public static void main(String[] args)
    {
        System.out.println("Enter string\n");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        boolean op=str.isEmpty();
        if(!op)
        {
          System.out.println("The given string is not empty\n");

        }
        else
        System.out.println("The given string is empty\n");
    }
}
