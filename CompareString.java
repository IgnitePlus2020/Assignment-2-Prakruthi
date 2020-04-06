package com.tgt.igniteplus;
import java.util.Scanner;
public class CompareString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string 1\n");
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        System.out.println("Enter string 2\n");
        Scanner in1=new Scanner(System.in);
        String str2=in1.nextLine();
        if(str1.equals(str2))
            System.out.println("Strings are comapred with equals() method and they are equal\n");
            else
            System.out.println("Strings are compared with equals() method and they are not equal\n");
            if(str1.compareTo(str2)==0)
                System.out.println("Strings are comapred with .compareTo() method and they are equal\n");
            else
            System.out.println("Strings are comapred with .compareTo() method and they are not equal\n");
        if(str1.equalsIgnoreCase(str2))
            System.out.println("Strings are comapred with equalsIgnoreCase() method and they are equal\n");
        else
            System.out.println("Strings are comapred with equalsIgnoreCase() method and they are not equal\n");
        if(str1.compareTo(str2)==0)
            System.out.println("Strings are comapred with .compareIgnoreCase() method and they are  equal\n");
        else
            System.out.println("Strings are comapred with .compareIgnoreCase() method and they are not equal\n");
    }
}
