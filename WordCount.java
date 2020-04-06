package com.tgt.igniteplus;
import java.util.Scanner;
public class WordCount
{
    static int wordcount(String str)
    {
        int count=0;
        char ch[]= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]= str.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        System.out.println(wordcount(str) + " words.");
    }
}