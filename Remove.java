package com.tgt.igniteplus;
import java.util.Scanner;
//Program to remove all occurrence of character from a sentence
public class Remove
{
    static void removeChar(String s, char c)
    {
        int j, count = 0, n = s.length();
        String t1=s.toLowerCase();
        char []t = t1.toCharArray();
        for (int i = j = 0; i <n; i++)
        {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }

        while(count > 0)
        {
            t[j++] = '\0';
            count--;
        }
        System.out.println(t);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        Scanner in1=new Scanner(System.in);
        System.out.println("Enter the character you want to remove\n");
        String rem=in1.nextLine();
        char r=rem.charAt(0);
        removeChar(s, 't');
    }
}

