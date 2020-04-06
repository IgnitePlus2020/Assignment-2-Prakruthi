package com.tgt.igniteplus;
// Program to write content into file using FileOutputStream.
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class WriteFile
{
    public static void main(String args[])
    {
        final String fileName = "file1.txt";
        try
        {
            File objFile = new File(fileName);
            if (objFile.exists() == false)
            {
                if (objFile.createNewFile())
                {
                    System.out.println("File created successfully.");
                }
                else
                    {
                        System.out.println("File creation failed!!!");
                        System.exit(0);
                    }
            }
            String text;
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter text to write into file: ");
            text = SC.nextLine();
            FileOutputStream fileOut = new FileOutputStream(objFile);
            fileOut.write(text.getBytes());
            fileOut.flush();
            fileOut.close();
            System.out.println("File saved.");
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}