package com.tgt.igniteplus;
import java.util.Scanner;
//To remove hyphens from the given string only if it is in between digits
public class RemoveIf
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string\n");
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String result = input.replaceAll("([1-9])(-)([1-9])", "$1 $3");
        System.out.println(result);
    }

}