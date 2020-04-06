package com.tgt.igniteplus;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
class Duplicate
{
    static void duplicateCharCount(String inputString)
    {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In "+inputString);
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the string\n");
        Scanner in=new Scanner(System.in);
        String inputString;
        inputString=in.nextLine();
        duplicateCharCount(inputString);
    }
}