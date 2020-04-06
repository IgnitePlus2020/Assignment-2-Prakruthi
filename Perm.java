package com.tgt.igniteplus;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
//Program to find the possible permutations of a given string
public class Perm
{
    public static Set<String> permutationFinder(String str)
    {
        Set<String> perm = new HashSet<String>();
        if (str == null)
        {
            return null;
        }
        else if (str.length() == 0)
        {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words)
        {
            for (int i = 0;i<=strNew.length();i++)
            {
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j)
    {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the string\n");
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
    }
}