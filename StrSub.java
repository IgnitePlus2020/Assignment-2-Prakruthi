package com.tgt.igniteplus;
//To check if the substring is present in the string
import java.util.Scanner;
public class StrSub
{
    public static void main(String args[])
    {
        String str1;
        Scanner in1=new Scanner(System.in);
        System.out.println("Enter the string\n");
        str1 = in1.nextLine();
        Scanner in2=new Scanner(System.in);
        System.out.println("Enter the substring\n");
        String str2 = in2.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        System.out.println("String: "  + str1);
        System.out.println("Substring: "  + str2);
        for (int i = 0; i <= n1 - n2; i++) {
            int j;
            for (j = 0; j < n2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j))
                    break;
            }
            if (j == n2) {
                System.out.println("The substring is present in the string at index " + i);
                return;
            }
        }
        System.out.println("The substring is not present in the string");
    }
}