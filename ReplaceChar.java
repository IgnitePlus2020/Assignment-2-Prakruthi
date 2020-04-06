package com.tgt.igniteplus;
import java.util.Scanner;
//Replace a certain character
public class ReplaceChar
    {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Input the String");
            String str=input.nextLine();
            System.out.println("Input the character you want to replace");
            char c = input.next().charAt(0);
            System.out.println("input the character you want to be replaced with");
            char r = input.next().charAt(0);
            String replacedstring=str.replace(c, r);
            System.out.println(replacedstring);

        }

}