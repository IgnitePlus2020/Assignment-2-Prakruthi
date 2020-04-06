package com.tgt.igniteplus;
//Covert the sentence to upper case
import java.util.Scanner;
class UpperCase
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sentence or word");
        String output=in.nextLine();
        String o = output.toUpperCase();
        System.out.println(o);
    }
}